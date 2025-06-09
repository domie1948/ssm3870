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


import com.dao.XueshengqingjiaxinxiDao;
import com.entity.XueshengqingjiaxinxiEntity;
import com.service.XueshengqingjiaxinxiService;
import com.entity.vo.XueshengqingjiaxinxiVO;
import com.entity.view.XueshengqingjiaxinxiView;

@Service("xueshengqingjiaxinxiService")
public class XueshengqingjiaxinxiServiceImpl extends ServiceImpl<XueshengqingjiaxinxiDao, XueshengqingjiaxinxiEntity> implements XueshengqingjiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengqingjiaxinxiEntity> page = this.selectPage(
                new Query<XueshengqingjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<XueshengqingjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengqingjiaxinxiEntity> wrapper) {
		  Page<XueshengqingjiaxinxiView> page =new Query<XueshengqingjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengqingjiaxinxiVO> selectListVO(Wrapper<XueshengqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengqingjiaxinxiVO selectVO(Wrapper<XueshengqingjiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengqingjiaxinxiView> selectListView(Wrapper<XueshengqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengqingjiaxinxiView selectView(Wrapper<XueshengqingjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
