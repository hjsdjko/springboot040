package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CailiaoxinxiEntity;
import com.entity.view.CailiaoxinxiView;

import com.service.CailiaoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 材料信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
@RestController
@RequestMapping("/cailiaoxinxi")
public class CailiaoxinxiController {
    @Autowired
    private CailiaoxinxiService cailiaoxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CailiaoxinxiEntity cailiaoxinxi,
		HttpServletRequest request){
        EntityWrapper<CailiaoxinxiEntity> ew = new EntityWrapper<CailiaoxinxiEntity>();

		PageUtils page = cailiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CailiaoxinxiEntity cailiaoxinxi, 
		HttpServletRequest request){
        EntityWrapper<CailiaoxinxiEntity> ew = new EntityWrapper<CailiaoxinxiEntity>();

		PageUtils page = cailiaoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cailiaoxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CailiaoxinxiEntity cailiaoxinxi){
       	EntityWrapper<CailiaoxinxiEntity> ew = new EntityWrapper<CailiaoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cailiaoxinxi, "cailiaoxinxi")); 
        return R.ok().put("data", cailiaoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CailiaoxinxiEntity cailiaoxinxi){
        EntityWrapper< CailiaoxinxiEntity> ew = new EntityWrapper< CailiaoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cailiaoxinxi, "cailiaoxinxi")); 
		CailiaoxinxiView cailiaoxinxiView =  cailiaoxinxiService.selectView(ew);
		return R.ok("查询材料信息成功").put("data", cailiaoxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CailiaoxinxiEntity cailiaoxinxi = cailiaoxinxiService.selectById(id);
        return R.ok().put("data", cailiaoxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CailiaoxinxiEntity cailiaoxinxi = cailiaoxinxiService.selectById(id);
        return R.ok().put("data", cailiaoxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CailiaoxinxiEntity cailiaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(cailiaoxinxi);
        cailiaoxinxiService.insert(cailiaoxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CailiaoxinxiEntity cailiaoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(cailiaoxinxi);
        cailiaoxinxiService.insert(cailiaoxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CailiaoxinxiEntity cailiaoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cailiaoxinxi);
        cailiaoxinxiService.updateById(cailiaoxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cailiaoxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<CailiaoxinxiEntity> wrapper = new EntityWrapper<CailiaoxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = cailiaoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	










}
