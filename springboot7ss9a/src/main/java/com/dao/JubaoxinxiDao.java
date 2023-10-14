package com.dao;

import com.entity.JubaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JubaoxinxiVO;
import com.entity.view.JubaoxinxiView;


/**
 * 举报信息
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface JubaoxinxiDao extends BaseMapper<JubaoxinxiEntity> {
	
	List<JubaoxinxiVO> selectListVO(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	JubaoxinxiVO selectVO(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	List<JubaoxinxiView> selectListView(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);

	List<JubaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
	JubaoxinxiView selectView(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
	
}
