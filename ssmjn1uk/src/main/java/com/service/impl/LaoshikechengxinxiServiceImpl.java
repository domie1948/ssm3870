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


import com.dao.LaoshikechengxinxiDao;
import com.entity.LaoshikechengxinxiEntity;
import com.service.LaoshikechengxinxiService;
import com.entity.vo.LaoshikechengxinxiVO;
import com.entity.view.LaoshikechengxinxiView;

@Service("laoshikechengxinxiService")
public class LaoshikechengxinxiServiceImpl extends ServiceImpl<LaoshikechengxinxiDao, LaoshikechengxinxiEntity> implements LaoshikechengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaoshikechengxinxiEntity> page = this.selectPage(
                new Query<LaoshikechengxinxiEntity>(params).getPage(),
                new EntityWrapper<LaoshikechengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaoshikechengxinxiEntity> wrapper) {
		  Page<LaoshikechengxinxiView> page =new Query<LaoshikechengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaoshikechengxinxiVO> selectListVO(Wrapper<LaoshikechengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaoshikechengxinxiVO selectVO(Wrapper<LaoshikechengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaoshikechengxinxiView> selectListView(Wrapper<LaoshikechengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaoshikechengxinxiView selectView(Wrapper<LaoshikechengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
