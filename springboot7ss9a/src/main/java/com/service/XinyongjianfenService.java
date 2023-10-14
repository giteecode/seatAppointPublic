package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinyongjianfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinyongjianfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinyongjianfenView;


/**
 * 信用减分
 *
 * @author 
 * @email 
 * @date 2021-04-16 20:36:41
 */
public interface XinyongjianfenService extends IService<XinyongjianfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinyongjianfenVO> selectListVO(Wrapper<XinyongjianfenEntity> wrapper);
   	
   	XinyongjianfenVO selectVO(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
   	
   	List<XinyongjianfenView> selectListView(Wrapper<XinyongjianfenEntity> wrapper);
   	
   	XinyongjianfenView selectView(@Param("ew") Wrapper<XinyongjianfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinyongjianfenEntity> wrapper);
   	
}

