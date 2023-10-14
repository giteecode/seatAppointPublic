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


import com.dao.XinyongfenDao;
import com.entity.XinyongfenEntity;
import com.service.XinyongfenService;
import com.entity.vo.XinyongfenVO;
import com.entity.view.XinyongfenView;

@Service("xinyongfenService")
public class XinyongfenServiceImpl extends ServiceImpl<XinyongfenDao, XinyongfenEntity> implements XinyongfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinyongfenEntity> page = this.selectPage(
                new Query<XinyongfenEntity>(params).getPage(),
                new EntityWrapper<XinyongfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinyongfenEntity> wrapper) {
		  Page<XinyongfenView> page =new Query<XinyongfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinyongfenVO> selectListVO(Wrapper<XinyongfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinyongfenVO selectVO(Wrapper<XinyongfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinyongfenView> selectListView(Wrapper<XinyongfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinyongfenView selectView(Wrapper<XinyongfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
