package com.dafeng.sec.user.domain.permission.entity;

/**
 * 	权限管理
 * @author 大风
 *
 */
public class Permission {
    private Integer id;

    private String name;

    private String depict;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the depict
	 */
	public String getDepict() {
		return depict;
	}

	/**
	 * @param depict the depict to set
	 */
	public void setDepict(String depict) {
		this.depict = depict;
	}

	public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}