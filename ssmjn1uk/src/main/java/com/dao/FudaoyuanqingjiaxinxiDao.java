package com.dao;

import com.entity.FudaoyuanqingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FudaoyuanqingjiaxinxiVO;
import com.entity.view.FudaoyuanqingjiaxinxiView;


/**
 * 辅导员请假信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface FudaoyuanqingjiaxinxiDao extends BaseMapper<FudaoyuanqingjiaxinxiEntity> {
	
	List<FudaoyuanqingjiaxinxiVO> selectListVO(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
	
	FudaoyuanqingjiaxinxiVO selectVO(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
	
	List<FudaoyuanqingjiaxinxiView> selectListView(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);

	List<FudaoyuanqingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
	
	FudaoyuanqingjiaxinxiView selectView(@Param("ew") Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper);
	
}
