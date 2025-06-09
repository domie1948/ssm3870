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


import com.dao.FudaoyuanxinxiDao;
import com.entity.FudaoyuanxinxiEntity;
import com.service.FudaoyuanxinxiService;
import com.entity.vo.FudaoyuanxinxiVO;
import com.entity.view.FudaoyuanxinxiView;

@Service("fudaoyuanxinxiService")
public class FudaoyuanxinxiServiceImpl extends ServiceImpl<FudaoyuanxinxiDao, FudaoyuanxinxiEntity> implements FudaoyuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FudaoyuanxinxiEntity> page = this.selectPage(
                new Query<FudaoyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<FudaoyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FudaoyuanxinxiEntity> wrapper) {
		  Page<FudaoyuanxinxiView> page =new Query<FudaoyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FudaoyuanxinxiVO> selectListVO(Wrapper<FudaoyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FudaoyuanxinxiVO selectVO(Wrapper<FudaoyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FudaoyuanxinxiView> selectListView(Wrapper<FudaoyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FudaoyuanxinxiView selectView(Wrapper<FudaoyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
