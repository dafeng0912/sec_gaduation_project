package com.dafeng.sec.circuit.domain.schoolinformation.entity;

/**
 * 	学校信息维护
 * @author 大风
 *
 */
public class SchoolInformation {
    private Integer id;

    private String manage;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage == null ? null : manage.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "SchoolInformation [id=" + id + ", manage=" + manage + ", userId=" + userId + "]";
	}
    
}