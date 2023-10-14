package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinyongfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinyongfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinyongfenView;


/**
 * 信用分
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongfenService extends IService<XinyongfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinyongfenVO> selectListVO(Wrapper<XinyongfenEntity> wrapper);
   	
   	XinyongfenVO selectVO(@Param("ew") Wrapper<XinyongfenEntity> wrapper);
   	
   	List<XinyongfenView> selectListView(Wrapper<XinyongfenEntity> wrapper);
   	
   	XinyongfenView selectView(@Param("ew") Wrapper<XinyongfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinyongfenEntity> wrapper);
   	
}

