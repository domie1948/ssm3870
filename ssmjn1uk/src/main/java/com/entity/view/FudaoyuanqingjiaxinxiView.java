package com.entity.view;

import com.entity.FudaoyuanqingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 辅导员请假信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("fudaoyuanqingjiaxinxi")
public class FudaoyuanqingjiaxinxiView  extends FudaoyuanqingjiaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FudaoyuanqingjiaxinxiView(){
	}
 
 	public FudaoyuanqingjiaxinxiView(FudaoyuanqingjiaxinxiEntity fudaoyuanqingjiaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fudaoyuanqingjiaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
