package com.entity.view;

import com.entity.XueshengqingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生请假信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@TableName("xueshengqingjiaxinxi")
public class XueshengqingjiaxinxiView  extends XueshengqingjiaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengqingjiaxinxiView(){
	}
 
 	public XueshengqingjiaxinxiView(XueshengqingjiaxinxiEntity xueshengqingjiaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengqingjiaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
