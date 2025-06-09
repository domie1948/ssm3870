package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师请假信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("jiaoshiqingjiaxinxi")
public class JiaoshiqingjiaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshiqingjiaxinxiEntity() {
		
	}
	
	public JiaoshiqingjiaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师账号
	 */
					
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 教师手机
	 */
					
	private String jiaoshishouji;
	
	/**
	 * 所属院系
	 */
					
	private String suoshuyuanxi;
	
	/**
	 * 所属年级
	 */
					
	private String suoshunianji;
	
	/**
	 * 请假天数及原因
	 */
					
	private String qingjiatianshujiyuanyin;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师账号
	 */
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：教师手机
	 */
	public void setJiaoshishouji(String jiaoshishouji) {
		this.jiaoshishouji = jiaoshishouji;
	}
	/**
	 * 获取：教师手机
	 */
	public String getJiaoshishouji() {
		return jiaoshishouji;
	}
	/**
	 * 设置：所属院系
	 */
	public void setSuoshuyuanxi(String suoshuyuanxi) {
		this.suoshuyuanxi = suoshuyuanxi;
	}
	/**
	 * 获取：所属院系
	 */
	public String getSuoshuyuanxi() {
		return suoshuyuanxi;
	}
	/**
	 * 设置：所属年级
	 */
	public void setSuoshunianji(String suoshunianji) {
		this.suoshunianji = suoshunianji;
	}
	/**
	 * 获取：所属年级
	 */
	public String getSuoshunianji() {
		return suoshunianji;
	}
	/**
	 * 设置：请假天数及原因
	 */
	public void setQingjiatianshujiyuanyin(String qingjiatianshujiyuanyin) {
		this.qingjiatianshujiyuanyin = qingjiatianshujiyuanyin;
	}
	/**
	 * 获取：请假天数及原因
	 */
	public String getQingjiatianshujiyuanyin() {
		return qingjiatianshujiyuanyin;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
