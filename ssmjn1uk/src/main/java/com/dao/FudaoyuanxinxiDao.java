package com.dao;

import com.entity.FudaoyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FudaoyuanxinxiVO;
import com.entity.view.FudaoyuanxinxiView;


/**
 * 辅导员信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface FudaoyuanxinxiDao extends BaseMapper<FudaoyuanxinxiEntity> {
	
	List<FudaoyuanxinxiVO> selectListVO(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
	
	FudaoyuanxinxiVO selectVO(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
	
	List<FudaoyuanxinxiView> selectListView(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);

	List<FudaoyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
	
	FudaoyuanxinxiView selectView(@Param("ew") Wrapper<FudaoyuanxinxiEntity> wrapper);
	
}
