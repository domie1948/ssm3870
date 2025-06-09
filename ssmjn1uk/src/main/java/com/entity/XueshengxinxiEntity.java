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
 * 学生信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
@TableName("xueshengxinxi")
public class XueshengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengxinxiEntity() {
		
	}
	
	public XueshengxinxiEntity(T t) {
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
	 * 学生账号
	 */
					
	private String xueshengzhanghao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 学生手机
	 */
					
	private String xueshengshouji;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 所在院系
	 */
					
	private String suozaiyuanxi;
	
	/**
	 * 所在年级
	 */
					
	private String suozainianji;
	
	/**
	 * 所在班级
	 */
					
	private String suozaibanji;
	
	/**
	 * 上课状况
	 */
					
	private String shangkezhuangkuang;
	
	/**
	 * 请假天数以及原因
	 */
					
	private String qingjiatianshuyijiyuanyin;
	
	/**
	 * 缺勤天数及原因
	 */
					
	private String queqintianshujiyuanyin;
	
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
	 * 设置：学生账号
	 */
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
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
	 * 设置：学生手机
	 */
	public void setXueshengshouji(String xueshengshouji) {
		this.xueshengshouji = xueshengshouji;
	}
	/**
	 * 获取：学生手机
	 */
	public String getXueshengshouji() {
		return xueshengshouji;
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
	 * 设置：所在院系
	 */
	public void setSuozaiyuanxi(String suozaiyuanxi) {
		this.suozaiyuanxi = suozaiyuanxi;
	}
	/**
	 * 获取：所在院系
	 */
	public String getSuozaiyuanxi() {
		return suozaiyuanxi;
	}
	/**
	 * 设置：所在年级
	 */
	public void setSuozainianji(String suozainianji) {
		this.suozainianji = suozainianji;
	}
	/**
	 * 获取：所在年级
	 */
	public String getSuozainianji() {
		return suozainianji;
	}
	/**
	 * 设置：所在班级
	 */
	public void setSuozaibanji(String suozaibanji) {
		this.suozaibanji = suozaibanji;
	}
	/**
	 * 获取：所在班级
	 */
	public String getSuozaibanji() {
		return suozaibanji;
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
	 * 设置：请假天数以及原因
	 */
	public void setQingjiatianshuyijiyuanyin(String qingjiatianshuyijiyuanyin) {
		this.qingjiatianshuyijiyuanyin = qingjiatianshuyijiyuanyin;
	}
	/**
	 * 获取：请假天数以及原因
	 */
	public String getQingjiatianshuyijiyuanyin() {
		return qingjiatianshuyijiyuanyin;
	}
	/**
	 * 设置：缺勤天数及原因
	 */
	public void setQueqintianshujiyuanyin(String queqintianshujiyuanyin) {
		this.queqintianshujiyuanyin = queqintianshujiyuanyin;
	}
	/**
	 * 获取：缺勤天数及原因
	 */
	public String getQueqintianshujiyuanyin() {
		return queqintianshujiyuanyin;
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
