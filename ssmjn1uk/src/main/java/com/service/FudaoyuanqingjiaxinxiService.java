package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FudaoyuanqingjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FudaoyuanqingjiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FudaoyuanqingjiaxinxiView;


/**
 * 辅导员请假信息
 *
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface FudaoyuanqingjiaxinxiService extends IService<FudaoyuanqingjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FudaoyuanqingjiaxinxiVO> selectListVO(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
   	
   	FudaoyuanqingjiaxinxiVO selectVO(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
   	
   	List<FudaoyuanqingjiaxinxiView> selectListView(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
   	
   	FudaoyuanqingjiaxinxiView selectView(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
   	
}

