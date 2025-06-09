package com.entity.view;

import com.entity.LaoshikechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 老师课程信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
@TableName("laoshikechengxinxi")
public class LaoshikechengxinxiView  extends LaoshikechengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LaoshikechengxinxiView(){
	}
 
 	public LaoshikechengxinxiView(LaoshikechengxinxiEntity laoshikechengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, laoshikechengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
