package com.dao;

import com.entity.QiandaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiandaoxinxiVO;
import com.entity.view.QiandaoxinxiView;


/**
 * 签到信息
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface QiandaoxinxiDao extends BaseMapper<QiandaoxinxiEntity> {
	
	List<QiandaoxinxiVO> selectListVO(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
	
	QiandaoxinxiVO selectVO(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
	
	List<QiandaoxinxiView> selectListView(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);

	List<QiandaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
	
	QiandaoxinxiView selectView(@Param("ew") Wrapper<QiandaoxinxiEntity> wrapper);
	
}
