package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuoweiyuyueDao;
import com.entity.ZuoweiyuyueEntity;
import com.service.ZuoweiyuyueService;
import com.entity.vo.ZuoweiyuyueVO;
import com.entity.view.ZuoweiyuyueView;

@Service("zuoweiyuyueService")
public class ZuoweiyuyueServiceImpl extends ServiceImpl<ZuoweiyuyueDao, ZuoweiyuyueEntity> implements ZuoweiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweiyuyueEntity> page = this.selectPage(
                new Query<ZuoweiyuyueEntity>(params).getPage(),
                new EntityWrapper<ZuoweiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweiyuyueEntity> wrapper) {
		  Page<ZuoweiyuyueView> page =new Query<ZuoweiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweiyuyueVO> selectListVO(Wrapper<ZuoweiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweiyuyueVO selectVO(Wrapper<ZuoweiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweiyuyueView> selectListView(Wrapper<ZuoweiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweiyuyueView selectView(Wrapper<ZuoweiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
