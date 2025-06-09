package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshiqingjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshiqingjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshiqingjiaxinxiView;


/**
 * 教师请假信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface JiaoshiqingjiaxinxiService extends IService<JiaoshiqingjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshiqingjiaxinxiVO> selectListVO(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
   	
   	JiaoshiqingjiaxinxiVO selectVO(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
   	
   	List<JiaoshiqingjiaxinxiView> selectListView(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
   	
   	JiaoshiqingjiaxinxiView selectView(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
   	
}

