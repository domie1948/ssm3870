package com.dao;

import com.entity.LaoshikechengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaoshikechengxinxiVO;
import com.entity.view.LaoshikechengxinxiView;


/**
 * 老师课程信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
public interface LaoshikechengxinxiDao extends BaseMapper<LaoshikechengxinxiEntity> {
	
	List<LaoshikechengxinxiVO> selectListVO(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
	
	LaoshikechengxinxiVO selectVO(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
	
	List<LaoshikechengxinxiView> selectListView(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);

	List<LaoshikechengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
	
	LaoshikechengxinxiView selectView(@Param("ew") Wrapper<LaoshikechengxinxiEntity> wrapper);
	
}
