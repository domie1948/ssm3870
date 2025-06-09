package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengkechengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengkechengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengkechengxinxiView;


/**
 * 学生课程信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
public interface XueshengkechengxinxiService extends IService<XueshengkechengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengkechengxinxiVO> selectListVO(Wrapper<XueshengkechengxinxiEntity> wrapper);
   	
   	XueshengkechengxinxiVO selectVO(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
   	
   	List<XueshengkechengxinxiView> selectListView(Wrapper<XueshengkechengxinxiEntity> wrapper);
   	
   	XueshengkechengxinxiView selectView(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengkechengxinxiEntity> wrapper);
   	
}

