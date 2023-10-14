package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweixinxiView;


/**
 * 座位信息
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface ZuoweixinxiService extends IService<ZuoweixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoweixinxiVO> selectListVO(Wrapper<ZuoweixinxiEntity> wrapper);
   	
   	ZuoweixinxiVO selectVO(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
   	
   	List<ZuoweixinxiView> selectListView(Wrapper<ZuoweixinxiEntity> wrapper);
   	
   	ZuoweixinxiView selectView(@Param("ew") Wrapper<ZuoweixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweixinxiEntity> wrapper);
   	
}

