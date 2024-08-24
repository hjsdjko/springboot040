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

import com.entity.DangaofenleiEntity;
import com.entity.view.DangaofenleiView;

import com.service.DangaofenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 蛋糕分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
@RestController
@RequestMapping("/dangaofenlei")
public class DangaofenleiController {
    @Autowired
    private DangaofenleiService dangaofenleiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DangaofenleiEntity dangaofenlei,
		HttpServletRequest request){
        EntityWrapper<DangaofenleiEntity> ew = new EntityWrapper<DangaofenleiEntity>();

		PageUtils page = dangaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangaofenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DangaofenleiEntity dangaofenlei, 
		HttpServletRequest request){
        EntityWrapper<DangaofenleiEntity> ew = new EntityWrapper<DangaofenleiEntity>();

		PageUtils page = dangaofenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dangaofenlei), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DangaofenleiEntity dangaofenlei){
       	EntityWrapper<DangaofenleiEntity> ew = new EntityWrapper<DangaofenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dangaofenlei, "dangaofenlei")); 
        return R.ok().put("data", dangaofenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DangaofenleiEntity dangaofenlei){
        EntityWrapper< DangaofenleiEntity> ew = new EntityWrapper< DangaofenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dangaofenlei, "dangaofenlei")); 
		DangaofenleiView dangaofenleiView =  dangaofenleiService.selectView(ew);
		return R.ok("查询蛋糕分类成功").put("data", dangaofenleiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DangaofenleiEntity dangaofenlei = dangaofenleiService.selectById(id);
        return R.ok().put("data", dangaofenlei);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DangaofenleiEntity dangaofenlei = dangaofenleiService.selectById(id);
        return R.ok().put("data", dangaofenlei);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DangaofenleiEntity dangaofenlei, HttpServletRequest request){
        if(dangaofenleiService.selectCount(new EntityWrapper<DangaofenleiEntity>().eq("dangaofenlei", dangaofenlei.getDangaofenlei()))>0) {
            return R.error("蛋糕分类已存在");
        }
    	//ValidatorUtils.validateEntity(dangaofenlei);
        dangaofenleiService.insert(dangaofenlei);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DangaofenleiEntity dangaofenlei, HttpServletRequest request){
        if(dangaofenleiService.selectCount(new EntityWrapper<DangaofenleiEntity>().eq("dangaofenlei", dangaofenlei.getDangaofenlei()))>0) {
            return R.error("蛋糕分类已存在");
        }
    	//ValidatorUtils.validateEntity(dangaofenlei);
        dangaofenleiService.insert(dangaofenlei);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DangaofenleiEntity dangaofenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dangaofenlei);
        if(dangaofenleiService.selectCount(new EntityWrapper<DangaofenleiEntity>().ne("id", dangaofenlei.getId()).eq("dangaofenlei", dangaofenlei.getDangaofenlei()))>0) {
            return R.error("蛋糕分类已存在");
        }
        dangaofenleiService.updateById(dangaofenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dangaofenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
