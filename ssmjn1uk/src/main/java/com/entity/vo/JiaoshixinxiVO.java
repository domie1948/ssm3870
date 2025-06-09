package com.entity.vo;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教师信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public class JiaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
	/**
	 * 所属院系
	 */
	
	private String suoshuyuanxi;
		
	/**
	 * 所属年级
	 */
	
	private String suoshunianji;
		
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
