package com.dafeng.sec.user.domain.role.entity;

public class Role {
    private Integer id;

    private String role;
    
    

    @Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}