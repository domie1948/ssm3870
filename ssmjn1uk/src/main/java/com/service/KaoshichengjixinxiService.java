package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshichengjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshichengjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshichengjixinxiView;


/**
 * 考试成绩信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface KaoshichengjixinxiService extends IService<KaoshichengjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshichengjixinxiVO> selectListVO(Wrapper<KaoshichengjixinxiEntity> wrapper);
   	
   	KaoshichengjixinxiVO selectVO(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
   	
   	List<KaoshichengjixinxiView> selectListView(Wrapper<KaoshichengjixinxiEntity> wrapper);
   	
   	KaoshichengjixinxiView selectView(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshichengjixinxiEntity> wrapper);
   	
}

