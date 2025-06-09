package com.entity.view;

import com.entity.XueshengkechengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生课程信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
@TableName("xueshengkechengxinxi")
public class XueshengkechengxinxiView  extends XueshengkechengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengkechengxinxiView(){
	}
 
 	public XueshengkechengxinxiView(XueshengkechengxinxiEntity xueshengkechengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengkechengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
