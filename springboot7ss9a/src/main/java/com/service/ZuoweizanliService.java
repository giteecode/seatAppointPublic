package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweizanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweizanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweizanliView;


/**
 * 座位暂离
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface ZuoweizanliService extends IService<ZuoweizanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoweizanliVO> selectListVO(Wrapper<ZuoweizanliEntity> wrapper);
   	
   	ZuoweizanliVO selectVO(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
   	
   	List<ZuoweizanliView> selectListView(Wrapper<ZuoweizanliEntity> wrapper);
   	
   	ZuoweizanliView selectView(@Param("ew") Wrapper<ZuoweizanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweizanliEntity> wrapper);
   	
}

