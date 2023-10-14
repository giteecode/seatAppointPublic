package com.dao;

import com.entity.XinyongjianfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinyongjianfenVO;
import com.entity.view.XinyongjianfenView;


/**
 * 信用减分
 * 
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongjianfenDao extends BaseMapper<XinyongjianfenEntity> {
	
	List<XinyongjianfenVO> selectListVO(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
	
	XinyongjianfenVO selectVO(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
	
	List<XinyongjianfenView> selectListView(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);

	List<XinyongjianfenView> selectListView(Pagination page,@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
	
	XinyongjianfenView selectView(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
	
}
