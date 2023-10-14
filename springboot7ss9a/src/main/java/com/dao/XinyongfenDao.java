package com.dao;

import com.entity.XinyongfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinyongfenVO;
import com.entity.view.XinyongfenView;


/**
 * 信用分
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongfenDao extends BaseMapper<XinyongfenEntity> {
	
	List<XinyongfenVO> selectListVO(@Param("ew") Wrapper<XinyongfenEntity> wrapper);
	
	XinyongfenVO selectVO(@Param("ew") Wrapper<XinyongfenEntity> wrapper);
	
	List<XinyongfenView> selectListView(@Param("ew") Wrapper<XinyongfenEntity> wrapper);

	List<XinyongfenView> selectListView(Pagination page,@Param("ew") Wrapper<XinyongfenEntity> wrapper);
	
	XinyongfenView selectView(@Param("ew") Wrapper<XinyongfenEntity> wrapper);
	
}
