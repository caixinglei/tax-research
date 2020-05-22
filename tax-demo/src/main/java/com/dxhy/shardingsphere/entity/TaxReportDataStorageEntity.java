package com.dxhy.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("tax_report_data_storage")
public class TaxReportDataStorageEntity {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    // 任务ID,provision==0 对应tax_work_task.id;provision==1对应tax_provision_task.id
    private String taskId;

    // 数值
    private String value;

    // 汇总标志:0非汇总数据,1汇总数据
    private String summaryFlag;

    // spread_workbook_tag_id
    private String spreadWorkbookTagId;

    // spread_sheet_tag_id
    private String spreadSheetTagId;

    // spreadCellTagId
    private String spreadCellTagId;

    // 是否为计提表任务（0否 1是）
    private String provision;

    // 单元格状态（0默认 1被编辑过）
    private String spreadCellState;
}
