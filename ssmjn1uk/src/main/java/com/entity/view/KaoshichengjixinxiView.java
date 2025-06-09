package com.entity.view;

import com.entity.KaoshichengjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试成绩信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("kaoshichengjixinxi")
public class KaoshichengjixinxiView  extends KaoshichengjixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshichengjixinxiView(){
	}
 
 	public KaoshichengjixinxiView(KaoshichengjixinxiEntity kaoshichengjixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshichengjixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
