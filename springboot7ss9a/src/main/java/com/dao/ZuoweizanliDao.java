package com.dao;

import com.entity.ZuoweizanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweizanliVO;
import com.entity.view.ZuoweizanliView;


/**
 * 座位暂离
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface ZuoweizanliDao extends BaseMapper<ZuoweizanliEntity> {
	
	List<ZuoweizanliVO> selectListVO(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
	
	ZuoweizanliVO selectVO(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
	
	List<ZuoweizanliView> selectListView(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);

	List<ZuoweizanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
	
	ZuoweizanliView selectView(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
	
}
