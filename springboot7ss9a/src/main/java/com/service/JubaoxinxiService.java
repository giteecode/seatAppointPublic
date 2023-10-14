package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JubaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JubaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JubaoxinxiView;


/**
 * 举报信息
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface JubaoxinxiService extends IService<JubaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JubaoxinxiVO> selectListVO(Wrapper<JubaoxinxiEntity> wrapper);
   	
   	JubaoxinxiVO selectVO(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
   	
   	List<JubaoxinxiView> selectListView(Wrapper<JubaoxinxiEntity> wrapper);
   	
   	JubaoxinxiView selectView(@Param("ew") Wrapper<JubaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JubaoxinxiEntity> wrapper);
   	
}

