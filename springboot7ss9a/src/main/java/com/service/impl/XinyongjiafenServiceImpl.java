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


import com.dao.XinyongjiafenDao;
import com.entity.XinyongjiafenEntity;
import com.service.XinyongjiafenService;
import com.entity.vo.XinyongjiafenVO;
import com.entity.view.XinyongjiafenView;

@Service("xinyongjiafenService")
public class XinyongjiafenServiceImpl extends ServiceImpl<XinyongjiafenDao, XinyongjiafenEntity> implements XinyongjiafenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinyongjiafenEntity> page = this.selectPage(
                new Query<XinyongjiafenEntity>(params).getPage(),
                new EntityWrapper<XinyongjiafenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinyongjiafenEntity> wrapper) {
		  Page<XinyongjiafenView> page =new Query<XinyongjiafenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinyongjiafenVO> selectListVO(Wrapper<XinyongjiafenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinyongjiafenVO selectVO(Wrapper<XinyongjiafenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinyongjiafenView> selectListView(Wrapper<XinyongjiafenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinyongjiafenView selectView(Wrapper<XinyongjiafenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
