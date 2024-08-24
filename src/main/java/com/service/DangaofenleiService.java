package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DangaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DangaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DangaofenleiView;


/**
 * 蛋糕分类
 *
 * @author 
 * @email 
 * @date 2024-04-21 10:09:58
 */
public interface DangaofenleiService extends IService<DangaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DangaofenleiVO> selectListVO(Wrapper<DangaofenleiEntity> wrapper);
   	
   	DangaofenleiVO selectVO(@Param("ew") Wrapper<DangaofenleiEntity> wrapper);
   	
   	List<DangaofenleiView> selectListView(Wrapper<DangaofenleiEntity> wrapper);
   	
   	DangaofenleiView selectView(@Param("ew") Wrapper<DangaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DangaofenleiEntity> wrapper);

   	

}

