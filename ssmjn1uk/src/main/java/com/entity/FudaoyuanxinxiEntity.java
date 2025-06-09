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
 * 辅导员信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("fudaoyuanxinxi")
public class FudaoyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FudaoyuanxinxiEntity() {
		
	}
	
	public FudaoyuanxinxiEntity(T t) {
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
	 * 辅导员账号
	 */
					
	private String fudaoyuanzhanghao;
	
	/**
	 * 辅导员姓名
	 */
					
	private String fudaoyuanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 辅导员手机
	 */
					
	private String fudaoyuanshouji;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 所属院系
	 */
					
	private String suoshuyuanxi;
	
	/**
	 * 上课状况
	 */
					
	private String shangkezhuangkuang;
	
	/**
	 * 请假天数及原因
	 */
					
	private String qingjiatianshujiyuanyin;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：辅导员账号
	 */
	public void setFudaoyuanzhanghao(String fudaoyuanzhanghao) {
		this.fudaoyuanzhanghao = fudaoyuanzhanghao;
	}
	/**
	 * 获取：辅导员账号
	 */
	public String getFudaoyuanzhanghao() {
		return fudaoyuanzhanghao;
	}
	/**
	 * 设置：辅导员姓名
	 */
	public void setFudaoyuanxingming(String fudaoyuanxingming) {
		this.fudaoyuanxingming = fudaoyuanxingming;
	}
	/**
	 * 获取：辅导员姓名
	 */
	public String getFudaoyuanxingming() {
		return fudaoyuanxingming;
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
	 * 设置：辅导员手机
	 */
	public void setFudaoyuanshouji(String fudaoyuanshouji) {
		this.fudaoyuanshouji = fudaoyuanshouji;
	}
	/**
	 * 获取：辅导员手机
	 */
	public String getFudaoyuanshouji() {
		return fudaoyuanshouji;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
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
	 * 设置：上课状况
	 */
	public void setShangkezhuangkuang(String shangkezhuangkuang) {
		this.shangkezhuangkuang = shangkezhuangkuang;
	}
	/**
	 * 获取：上课状况
	 */
	public String getShangkezhuangkuang() {
		return shangkezhuangkuang;
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

}
