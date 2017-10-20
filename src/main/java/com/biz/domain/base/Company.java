package com.biz.domain.base;

public class Company {
    /**
     * ID
     */
    private Integer departId;

    /**
     * 部门名称
     */
    private String departName;

    /**
     * 
     */
    private String departCode;

    /**
     * ID
     * @return DEPART_ID ID
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * ID
     * @param departId ID
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * 部门名称
     * @return DEPART_NAME 部门名称
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * 部门名称
     * @param departName 部门名称
     */
    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    /**
     * 
     * @return DEPART_CODE 
     */
    public String getDepartCode() {
        return departCode;
    }

    /**
     * 
     * @param departCode 
     */
    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }
}