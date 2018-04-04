package com.dgd.entity;

import lombok.Data;

/**
 * @Author DGD
 * @date 2018/4/4.
 */
@Data
public class ShortEmpInfo {
    private long empId;
    private String empName;
    private String empNo;

    public ShortEmpInfo() {}

    public ShortEmpInfo(long empId, String empName, String empNo) {
        this.empId = empId;
        this.empName = empName;
        this.empNo = empNo;
    }
}
