package com.ajiu.core.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author:baitianbo
 * @Date create in 2020/7/10 16:30
 * @Description:
 */
@Data
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long Id;
    @CreationTimestamp
    @Column(name = "create_time",columnDefinition="DATETIME COMMENT '创建时间/注册时间'")
    private Date createTime;
    @Column(name = "create_by",columnDefinition="bigint COMMENT '创建人'")
    @CreatedBy
    private Long createBy;
    @UpdateTimestamp
    @Column(name = "modify_time",columnDefinition="DATETIME COMMENT '最后更新时间'")
    private Date modifyTime;
    @LastModifiedBy
    @Column(name = "modify_by",columnDefinition="bigint COMMENT '最后更新人'")
    private Long modifyBy;
}
