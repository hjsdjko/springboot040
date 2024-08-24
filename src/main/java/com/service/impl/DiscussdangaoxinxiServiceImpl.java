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


import com.dao.DiscussdangaoxinxiDao;
import com.entity.DiscussdangaoxinxiEntity;
import com.service.DiscussdangaoxinxiService;
import com.entity.vo.DiscussdangaoxinxiVO;
import com.entity.view.DiscussdangaoxinxiView;

@Service("discussdangaoxinxiService")
public class DiscussdangaoxinxiServiceImpl extends ServiceImpl<DiscussdangaoxinxiDao, DiscussdangaoxinxiEntity> implements DiscussdangaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdangaoxinxiEntity> page = this.selectPage(
                new Query<DiscussdangaoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdangaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdangaoxinxiEntity> wrapper) {
		  Page<DiscussdangaoxinxiView> page =new Query<DiscussdangaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussdangaoxinxiVO> selectListVO(Wrapper<DiscussdangaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdangaoxinxiVO selectVO(Wrapper<DiscussdangaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdangaoxinxiView> selectListView(Wrapper<DiscussdangaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdangaoxinxiView selectView(Wrapper<DiscussdangaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
