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
 * 考试成绩信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("kaoshichengjixinxi")
public class KaoshichengjixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshichengjixinxiEntity() {
		
	}
	
	public KaoshichengjixinxiEntity(T t) {
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
	 * 教师账号
	 */
					
	private String jiaoshizhanghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 课程号
	 */
					
	private String kechenghao;
	
	/**
	 * 分数
	 */
					
	private Integer fenshu;
	
	/**
	 * 分数等级
	 */
					
	private String fenshudengji;
	
	/**
	 * 课程掌握程度
	 */
					
	private String kechengzhangwochengdu;
	
	/**
	 * 辅导员账号
	 */
					
	private String fudaoyuanzhanghao;
	
	/**
	 * 辅导员姓名
	 */
					
	private String fudaoyuanxingming;
	
	
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
	 * 设置：课程号
	 */
	public void setKechenghao(String kechenghao) {
		this.kechenghao = kechenghao;
	}
	/**
	 * 获取：课程号
	 */
	public String getKechenghao() {
		return kechenghao;
	}
	/**
	 * 设置：分数
	 */
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
	/**
	 * 设置：分数等级
	 */
	public void setFenshudengji(String fenshudengji) {
		this.fenshudengji = fenshudengji;
	}
	/**
	 * 获取：分数等级
	 */
	public String getFenshudengji() {
		return fenshudengji;
	}
	/**
	 * 设置：课程掌握程度
	 */
	public void setKechengzhangwochengdu(String kechengzhangwochengdu) {
		this.kechengzhangwochengdu = kechengzhangwochengdu;
	}
	/**
	 * 获取：课程掌握程度
	 */
	public String getKechengzhangwochengdu() {
		return kechengzhangwochengdu;
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

}
