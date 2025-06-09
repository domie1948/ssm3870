package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshiqingjiaxinxiDao;
import com.entity.JiaoshiqingjiaxinxiEntity;
import com.service.JiaoshiqingjiaxinxiService;
import com.entity.vo.JiaoshiqingjiaxinxiVO;
import com.entity.view.JiaoshiqingjiaxinxiView;

@Service("jiaoshiqingjiaxinxiService")
public class JiaoshiqingjiaxinxiServiceImpl extends ServiceImpl<JiaoshiqingjiaxinxiDao, JiaoshiqingjiaxinxiEntity> implements JiaoshiqingjiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshiqingjiaxinxiEntity> page = this.selectPage(
                new Query<JiaoshiqingjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoshiqingjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshiqingjiaxinxiEntity> wrapper) {
		  Page<JiaoshiqingjiaxinxiView> page =new Query<JiaoshiqingjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshiqingjiaxinxiVO> selectListVO(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshiqingjiaxinxiVO selectVO(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshiqingjiaxinxiView> selectListView(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshiqingjiaxinxiView selectView(Wrapper<JiaoshiqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
