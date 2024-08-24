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


import com.dao.DangaofenleiDao;
import com.entity.DangaofenleiEntity;
import com.service.DangaofenleiService;
import com.entity.vo.DangaofenleiVO;
import com.entity.view.DangaofenleiView;

@Service("dangaofenleiService")
public class DangaofenleiServiceImpl extends ServiceImpl<DangaofenleiDao, DangaofenleiEntity> implements DangaofenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangaofenleiEntity> page = this.selectPage(
                new Query<DangaofenleiEntity>(params).getPage(),
                new EntityWrapper<DangaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangaofenleiEntity> wrapper) {
		  Page<DangaofenleiView> page =new Query<DangaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DangaofenleiVO> selectListVO(Wrapper<DangaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangaofenleiVO selectVO(Wrapper<DangaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangaofenleiView> selectListView(Wrapper<DangaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangaofenleiView selectView(Wrapper<DangaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
