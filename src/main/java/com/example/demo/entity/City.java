package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Setter
@Getter
@Entity
@Table(name = "t_city")
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", columnDefinition = "char(32) comment '主键'")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid.hex")
	@GeneratedValue(generator = "paymentableGenerator")
	private String id;

	@Column(name = "create_time", columnDefinition = "datetime comment '创建时间'")
	private Date createTime;

	@Column(name = "name", columnDefinition = "varchar(255) comment '城市名称'")
	private String name;

}
