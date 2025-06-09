package com.dao;

import com.entity.JiaoshiqingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshiqingjiaxinxiVO;
import com.entity.view.JiaoshiqingjiaxinxiView;


/**
 * 教师请假信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface JiaoshiqingjiaxinxiDao extends BaseMapper<JiaoshiqingjiaxinxiEntity> {
	
	List<JiaoshiqingjiaxinxiVO> selectListVO(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
	
	JiaoshiqingjiaxinxiVO selectVO(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
	
	List<JiaoshiqingjiaxinxiView> selectListView(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);

	List<JiaoshiqingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
	
	JiaoshiqingjiaxinxiView selectView(@Param("ew") Wrapper<JiaoshiqingjiaxinxiEntity> wrapper);
	
}
