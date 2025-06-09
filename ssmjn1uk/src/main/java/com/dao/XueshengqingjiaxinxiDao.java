package com.dao;

import com.entity.XueshengqingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengqingjiaxinxiVO;
import com.entity.view.XueshengqingjiaxinxiView;


/**
 * 学生请假信息
 * 
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
public interface XueshengqingjiaxinxiDao extends BaseMapper<XueshengqingjiaxinxiEntity> {
	
	List<XueshengqingjiaxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
	
	XueshengqingjiaxinxiVO selectVO(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
	
	List<XueshengqingjiaxinxiView> selectListView(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);

	List<XueshengqingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
	
	XueshengqingjiaxinxiView selectView(@Param("ew") Wrapper<XueshengqingjiaxinxiEntity> wrapper);
	
}
