package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweiyuyueView;


/**
 * 座位预约
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface ZuoweiyuyueService extends IService<ZuoweiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoweiyuyueVO> selectListVO(Wrapper<ZuoweiyuyueEntity> wrapper);
   	
   	ZuoweiyuyueVO selectVO(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
   	
   	List<ZuoweiyuyueView> selectListView(Wrapper<ZuoweiyuyueEntity> wrapper);
   	
   	ZuoweiyuyueView selectView(@Param("ew") Wrapper<ZuoweiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweiyuyueEntity> wrapper);
   	
}

