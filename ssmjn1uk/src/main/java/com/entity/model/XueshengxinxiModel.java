package com.entity.model;

import com.entity.XueshengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
public class XueshengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
