package com.dafeng.sec.user.domain.user.entity.BO;

import java.util.Date;

public class PerGetUserBo {
	
	private Integer userId;

    private Long userPassId;

    private String userName;

    private Integer userRoleId;

    private Integer userSex;

    private Long userPhone;

    private Integer userPermissionId;

    private Date userTime;

    private String userEmial;
    
    private int perId;
    
    private String perName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getUserPassId() {
		return userPassId;
	}

	public void setUserPassId(Long userPassId) {
		this.userPassId = userPassId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public Long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getUserPermissionId() {
		return userPermissionId;
	}

	public void setUserPermissionId(Integer userPermissionId) {
		this.userPermissionId = userPermissionId;
	}

	public Date getUserTime() {
		return userTime;
	}

	public void setUserTime(Date userTime) {
		this.userTime = userTime;
	}

	public String getUserEmial() {
		return userEmial;
	}

	public void setUserEmial(String userEmial) {
		this.userEmial = userEmial;
	}

	public int getPerId() {
		return perId;
	}

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	@Override
	public String toString() {
		return "PerGetUserBo [userId=" + userId + ", userPassId=" + userPassId + ", userName=" + userName
				+ ", userRoleId=" + userRoleId + ", userSex=" + userSex + ", userPhone=" + userPhone
				+ ", userPermissionId=" + userPermissionId + ", userTime=" + userTime + ", userEmial=" + userEmial
				+ ", perId=" + perId + ", perName=" + perName + "]";
	}
    
    
}
