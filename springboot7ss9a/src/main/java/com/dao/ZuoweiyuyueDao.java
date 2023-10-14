package com.dao;

import com.entity.ZuoweiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweiyuyueVO;
import com.entity.view.ZuoweiyuyueView;


/**
 * 座位预约
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface ZuoweiyuyueDao extends BaseMapper<ZuoweiyuyueEntity> {
	
	List<ZuoweiyuyueVO> selectListVO(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	ZuoweiyuyueVO selectVO(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	List<ZuoweiyuyueView> selectListView(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);

	List<ZuoweiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
	ZuoweiyuyueView selectView(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
	
}
