package com.dao;

import com.entity.DiscussdangaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdangaoxinxiVO;
import com.entity.view.DiscussdangaoxinxiView;


/**
 * 蛋糕信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-21 10:09:59
 */
public interface DiscussdangaoxinxiDao extends BaseMapper<DiscussdangaoxinxiEntity> {
	
	List<DiscussdangaoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdangaoxinxiEntity> wrapper);
	
	DiscussdangaoxinxiVO selectVO(@Param("ew") Wrapper<DiscussdangaoxinxiEntity> wrapper);
	
	List<DiscussdangaoxinxiView> selectListView(@Param("ew") Wrapper<DiscussdangaoxinxiEntity> wrapper);

	List<DiscussdangaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdangaoxinxiEntity> wrapper);

	
	DiscussdangaoxinxiView selectView(@Param("ew") Wrapper<DiscussdangaoxinxiEntity> wrapper);
	

}
