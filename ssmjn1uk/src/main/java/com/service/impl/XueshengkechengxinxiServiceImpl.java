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


import com.dao.XueshengkechengxinxiDao;
import com.entity.XueshengkechengxinxiEntity;
import com.service.XueshengkechengxinxiService;
import com.entity.vo.XueshengkechengxinxiVO;
import com.entity.view.XueshengkechengxinxiView;

@Service("xueshengkechengxinxiService")
public class XueshengkechengxinxiServiceImpl extends ServiceImpl<XueshengkechengxinxiDao, XueshengkechengxinxiEntity> implements XueshengkechengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengkechengxinxiEntity> page = this.selectPage(
                new Query<XueshengkechengxinxiEntity>(params).getPage(),
                new EntityWrapper<XueshengkechengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengkechengxinxiEntity> wrapper) {
		  Page<XueshengkechengxinxiView> page =new Query<XueshengkechengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengkechengxinxiVO> selectListVO(Wrapper<XueshengkechengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengkechengxinxiVO selectVO(Wrapper<XueshengkechengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengkechengxinxiView> selectListView(Wrapper<XueshengkechengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengkechengxinxiView selectView(Wrapper<XueshengkechengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
