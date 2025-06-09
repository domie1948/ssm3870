package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengqingjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengqingjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengqingjiaxinxiView;


/**
 * 学生请假信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface XueshengqingjiaxinxiService extends IService<XueshengqingjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengqingjiaxinxiVO> selectListVO(Wrapper<XueshengqingjiaxinxiEntity> wrapper);
   	
   	XueshengqingjiaxinxiVO selectVO(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
   	
   	List<XueshengqingjiaxinxiView> selectListView(Wrapper<XueshengqingjiaxinxiEntity> wrapper);
   	
   	XueshengqingjiaxinxiView selectView(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengqingjiaxinxiEntity> wrapper);
   	
}

