package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaoshikechengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaoshikechengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaoshikechengxinxiView;


/**
 * 老师课程信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
public interface LaoshikechengxinxiService extends IService<LaoshikechengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaoshikechengxinxiVO> selectListVO(Wrapper<LaoshikechengxinxiEntity> wrapper);
   	
   	LaoshikechengxinxiVO selectVO(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
   	
   	List<LaoshikechengxinxiView> selectListView(Wrapper<LaoshikechengxinxiEntity> wrapper);
   	
   	LaoshikechengxinxiView selectView(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaoshikechengxinxiEntity> wrapper);
   	
}

