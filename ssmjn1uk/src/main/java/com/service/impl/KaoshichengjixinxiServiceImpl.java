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


import com.dao.KaoshichengjixinxiDao;
import com.entity.KaoshichengjixinxiEntity;
import com.service.KaoshichengjixinxiService;
import com.entity.vo.KaoshichengjixinxiVO;
import com.entity.view.KaoshichengjixinxiView;

@Service("kaoshichengjixinxiService")
public class KaoshichengjixinxiServiceImpl extends ServiceImpl<KaoshichengjixinxiDao, KaoshichengjixinxiEntity> implements KaoshichengjixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshichengjixinxiEntity> page = this.selectPage(
                new Query<KaoshichengjixinxiEntity>(params).getPage(),
                new EntityWrapper<KaoshichengjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshichengjixinxiEntity> wrapper) {
		  Page<KaoshichengjixinxiView> page =new Query<KaoshichengjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshichengjixinxiVO> selectListVO(Wrapper<KaoshichengjixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshichengjixinxiVO selectVO(Wrapper<KaoshichengjixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshichengjixinxiView> selectListView(Wrapper<KaoshichengjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshichengjixinxiView selectView(Wrapper<KaoshichengjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
