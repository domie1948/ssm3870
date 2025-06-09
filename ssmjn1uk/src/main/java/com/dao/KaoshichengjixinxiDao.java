package com.dao;

import com.entity.KaoshichengjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshichengjixinxiVO;
import com.entity.view.KaoshichengjixinxiView;


/**
 * 考试成绩信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface KaoshichengjixinxiDao extends BaseMapper<KaoshichengjixinxiEntity> {
	
	List<KaoshichengjixinxiVO> selectListVO(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
	
	KaoshichengjixinxiVO selectVO(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
	
	List<KaoshichengjixinxiView> selectListView(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);

	List<KaoshichengjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
	
	KaoshichengjixinxiView selectView(@Param("ew") Wrapper<KaoshichengjixinxiEntity> wrapper);
	
}
