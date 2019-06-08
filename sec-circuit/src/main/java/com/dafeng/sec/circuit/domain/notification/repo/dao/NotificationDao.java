package com.dafeng.sec.circuit.domain.notification.repo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dafeng.sec.circuit.domain.notification.entity.Notification;
import com.dafeng.sec.circuit.domain.notification.entity.example.NotificationExample;

public interface NotificationDao {
    long countByExample(NotificationExample example);

    int deleteByExample(NotificationExample example);

    int insert(Notification record);

    int insertSelective(Notification record);

    List<Notification> selectByExample(NotificationExample example);

    int updateByExampleSelective(@Param("record") Notification record, @Param("example") NotificationExample example);

    int updateByExample(@Param("record") Notification record, @Param("example") NotificationExample example);
}