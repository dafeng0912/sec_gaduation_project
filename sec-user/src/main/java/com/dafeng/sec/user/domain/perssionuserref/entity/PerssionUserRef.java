package com.dafeng.sec.user.domain.perssionuserref.entity;

/**
 *	权限-用户关联表
 * @author 大风
 *
 */
public class PerssionUserRef {
    private Integer userId;

    private Integer permisssionId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPermisssionId() {
        return permisssionId;
    }

    public void setPermisssionId(Integer permisssionId) {
        this.permisssionId = permisssionId;
    }
}