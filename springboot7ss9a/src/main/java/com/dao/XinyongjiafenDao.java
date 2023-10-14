package com.dao;

import com.entity.XinyongjiafenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinyongjiafenVO;
import com.entity.view.XinyongjiafenView;


/**
 * 信用加分
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongjiafenDao extends BaseMapper<XinyongjiafenEntity> {
	
	List<XinyongjiafenVO> selectListVO(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
	
	XinyongjiafenVO selectVO(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
	
	List<XinyongjiafenView> selectListView(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);

	List<XinyongjiafenView> selectListView(Pagination page,@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
	
	XinyongjiafenView selectView(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
	
}
