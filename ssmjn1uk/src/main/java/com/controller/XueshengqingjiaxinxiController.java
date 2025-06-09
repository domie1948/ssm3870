package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueshengqingjiaxinxiEntity;
import com.entity.view.XueshengqingjiaxinxiView;

import com.service.XueshengqingjiaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学生请假信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-28 14:52:37
 */
@RestController
@RequestMapping("/xueshengqingjiaxinxi")
public class XueshengqingjiaxinxiController {
    @Autowired
    private XueshengqingjiaxinxiService xueshengqingjiaxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengqingjiaxinxiEntity xueshengqingjiaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xueshengqingjiaxinxi.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			xueshengqingjiaxinxi.setXueshengzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fudaoyuan")) {
			xueshengqingjiaxinxi.setFudaoyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengqingjiaxinxiEntity> ew = new EntityWrapper<XueshengqingjiaxinxiEntity>();
		PageUtils page = xueshengqingjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengqingjiaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengqingjiaxinxiEntity xueshengqingjiaxinxi, 
		HttpServletRequest request){
        EntityWrapper<XueshengqingjiaxinxiEntity> ew = new EntityWrapper<XueshengqingjiaxinxiEntity>();
		PageUtils page = xueshengqingjiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengqingjiaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengqingjiaxinxiEntity xueshengqingjiaxinxi){
       	EntityWrapper<XueshengqingjiaxinxiEntity> ew = new EntityWrapper<XueshengqingjiaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengqingjiaxinxi, "xueshengqingjiaxinxi")); 
        return R.ok().put("data", xueshengqingjiaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengqingjiaxinxiEntity xueshengqingjiaxinxi){
        EntityWrapper< XueshengqingjiaxinxiEntity> ew = new EntityWrapper< XueshengqingjiaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengqingjiaxinxi, "xueshengqingjiaxinxi")); 
		XueshengqingjiaxinxiView xueshengqingjiaxinxiView =  xueshengqingjiaxinxiService.selectView(ew);
		return R.ok("查询学生请假信息成功").put("data", xueshengqingjiaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengqingjiaxinxiEntity xueshengqingjiaxinxi = xueshengqingjiaxinxiService.selectById(id);
        return R.ok().put("data", xueshengqingjiaxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengqingjiaxinxiEntity xueshengqingjiaxinxi = xueshengqingjiaxinxiService.selectById(id);
        return R.ok().put("data", xueshengqingjiaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengqingjiaxinxiEntity xueshengqingjiaxinxi, HttpServletRequest request){
    	xueshengqingjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengqingjiaxinxi);

        xueshengqingjiaxinxiService.insert(xueshengqingjiaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengqingjiaxinxiEntity xueshengqingjiaxinxi, HttpServletRequest request){
    	xueshengqingjiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengqingjiaxinxi);

        xueshengqingjiaxinxiService.insert(xueshengqingjiaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengqingjiaxinxiEntity xueshengqingjiaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengqingjiaxinxi);
        xueshengqingjiaxinxiService.updateById(xueshengqingjiaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengqingjiaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueshengqingjiaxinxiEntity> wrapper = new EntityWrapper<XueshengqingjiaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshengzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fudaoyuan")) {
			wrapper.eq("fudaoyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengqingjiaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
