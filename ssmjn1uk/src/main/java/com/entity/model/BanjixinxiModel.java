package com.entity.model;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 班级信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public class BanjixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所在年级
	 */
	
	private Integer suozainianji;
		
	/**
	 * 班级号
	 */
	
	private Integer banjihao;
		
	/**
	 * 班级名称
	 */
	
	private String banjimingcheng;
		
	/**
	 * 班级人数
	 */
	
	private String banjirenshu;
		
	/**
	 * 辅导员账号
	 */
	
	private String fudaoyuanzhanghao;
		
	/**
	 * 辅导员姓名
	 */
	
	private String fudaoyuanxingming;
		
	/**
	 * 辅导员手机
	 */
	
	private String fudaoyuanshouji;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：所在年级
	 */
	 
	public void setSuozainianji(Integer suozainianji) {
		this.suozainianji = suozainianji;
	}
	
	/**
	 * 获取：所在年级
	 */
	public Integer getSuozainianji() {
		return suozainianji;
	}
				
	
	/**
	 * 设置：班级号
	 */
	 
	public void setBanjihao(Integer banjihao) {
		this.banjihao = banjihao;
	}
	
	/**
	 * 获取：班级号
	 */
	public Integer getBanjihao() {
		return banjihao;
	}
				
	
	/**
	 * 设置：班级名称
	 */
	 
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
				
	
	/**
	 * 设置：班级人数
	 */
	 
	public void setBanjirenshu(String banjirenshu) {
		this.banjirenshu = banjirenshu;
	}
	
	/**
	 * 获取：班级人数
	 */
	public String getBanjirenshu() {
		return banjirenshu;
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
