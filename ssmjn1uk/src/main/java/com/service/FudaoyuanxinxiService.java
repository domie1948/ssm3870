package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FudaoyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FudaoyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FudaoyuanxinxiView;


/**
 * 辅导员信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface FudaoyuanxinxiService extends IService<FudaoyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FudaoyuanxinxiVO> selectListVO(Wrapper<FudaoyuanxinxiEntity> wrapper);
   	
   	FudaoyuanxinxiVO selectVO(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
   	
   	List<FudaoyuanxinxiView> selectListView(Wrapper<FudaoyuanxinxiEntity> wrapper);
   	
   	FudaoyuanxinxiView selectView(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FudaoyuanxinxiEntity> wrapper);
   	
}

