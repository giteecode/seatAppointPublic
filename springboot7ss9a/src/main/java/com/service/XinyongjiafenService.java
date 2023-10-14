package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinyongjiafenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinyongjiafenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinyongjiafenView;


/**
 * 信用加分
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongjiafenService extends IService<XinyongjiafenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinyongjiafenVO> selectListVO(Wrapper<XinyongjiafenEntity> wrapper);
   	
   	XinyongjiafenVO selectVO(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
   	
   	List<XinyongjiafenView> selectListView(Wrapper<XinyongjiafenEntity> wrapper);
   	
   	XinyongjiafenView selectView(@Param("ew") Wrapper<XinyongjiafenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinyongjiafenEntity> wrapper);
   	
}

