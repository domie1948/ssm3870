package com.dao;

import com.entity.XueshengkechengxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengkechengxinxiVO;
import com.entity.view.XueshengkechengxinxiView;


/**
 * 学生课程信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:36
 */
public interface XueshengkechengxinxiDao extends BaseMapper<XueshengkechengxinxiEntity> {
	
	List<XueshengkechengxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
	
	XueshengkechengxinxiVO selectVO(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
	
	List<XueshengkechengxinxiView> selectListView(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);

	List<XueshengkechengxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
	
	XueshengkechengxinxiView selectView(@Param("ew") Wrapper<XueshengkechengxinxiEntity> wrapper);
	
}
