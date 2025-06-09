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


import com.dao.FudaoyuanqingjiaxinxiDao;
import com.entity.FudaoyuanqingjiaxinxiEntity;
import com.service.FudaoyuanqingjiaxinxiService;
import com.entity.vo.FudaoyuanqingjiaxinxiVO;
import com.entity.view.FudaoyuanqingjiaxinxiView;

@Service("fudaoyuanqingjiaxinxiService")
public class FudaoyuanqingjiaxinxiServiceImpl extends ServiceImpl<FudaoyuanqingjiaxinxiDao, FudaoyuanqingjiaxinxiEntity> implements FudaoyuanqingjiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FudaoyuanqingjiaxinxiEntity> page = this.selectPage(
                new Query<FudaoyuanqingjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<FudaoyuanqingjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper) {
		  Page<FudaoyuanqingjiaxinxiView> page =new Query<FudaoyuanqingjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FudaoyuanqingjiaxinxiVO> selectListVO(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FudaoyuanqingjiaxinxiVO selectVO(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FudaoyuanqingjiaxinxiView> selectListView(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FudaoyuanqingjiaxinxiView selectView(Wrapper<FudaoyuanqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
