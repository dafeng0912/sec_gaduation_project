package com.dafeng.sec.circuit.domain.admissionprocess.entity;

/**
 * 	校企合作时间轴
 * @author 大风
 *
 */
public class AdmissionProcess {
	
	private Integer id;

    private String name;

    private String content;

    private String time;

    /**
               * 执行情况
     */
    private String execution;

    private Integer order;

    private String partner;

    private String schedule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getExecution() {
        return execution;
    }

    public void setExecution(String execution) {
        this.execution = execution == null ? null : execution.trim();
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule == null ? null : schedule.trim();
    }

	@Override
	public String toString() {
		return "AdmissionProcess [id=" + id + ", name=" + name + ", content=" + content + ", time=" + time
				+ ", execution=" + execution + ", order=" + order + ", partner=" + partner + ", schedule=" + schedule
				+ "]";
	}
    
}