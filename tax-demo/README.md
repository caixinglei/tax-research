1.精确分片算法PreciseShardingAlgorithm
  范围分片算法RangeShardingAlgorithm
  复合分片算法ComplexKeysShardingAlgorithm
  Hint 分片算法HintShardingAlgorithm
  比较灵活 自己实现这些接口,自定义路由策略

2.主键:直接调用mybatisplus的内置接口,会采用mybatisplus的主键生成器,不用mybatisplus,手写sql,会用shardingjdbc的主键生成器

3.读写分离+分表:
   注意actual-data-nodes,配成主从数据源名称     

4.默认不会动态创建表,可以结合自己的业务实现动态创建表

5.实现分片算法若想使用其他springBean类,接口需要实现ApplicationContextAware,定义一个静态的applicationContext(spring容器实例),通过该实例getBean("xx");

6.集成com.alibaba.druid.pool.DruidDataSource,依赖druid-spring-boot-starter问题; 在启动类排除DruidDataSourceAutoConfigure,否则不能依赖
  druid-spring-boot-starter自动初始化连接池,因为加载的是springboot传统项目配置文件格式,不是sharding-jdbc配置文件格式,所以会造成sqlsessionTemplete无法初始化
  解决方法:1).去除druid-spring-boot-starter的依赖,只依赖 <groupId>com.alibaba</groupId>
                                                       <artifactId>druid</artifactId>
          2).启动类上排除自动装配类,exclude = DruidDataSourceAutoConfigure.class     