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


import com.dao.DangaoxinxiDao;
import com.entity.DangaoxinxiEntity;
import com.service.DangaoxinxiService;
import com.entity.vo.DangaoxinxiVO;
import com.entity.view.DangaoxinxiView;

@Service("dangaoxinxiService")
public class DangaoxinxiServiceImpl extends ServiceImpl<DangaoxinxiDao, DangaoxinxiEntity> implements DangaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangaoxinxiEntity> page = this.selectPage(
                new Query<DangaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DangaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangaoxinxiEntity> wrapper) {
		  Page<DangaoxinxiView> page =new Query<DangaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DangaoxinxiVO> selectListVO(Wrapper<DangaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangaoxinxiVO selectVO(Wrapper<DangaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangaoxinxiView> selectListView(Wrapper<DangaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangaoxinxiView selectView(Wrapper<DangaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DangaoxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DangaoxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DangaoxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
