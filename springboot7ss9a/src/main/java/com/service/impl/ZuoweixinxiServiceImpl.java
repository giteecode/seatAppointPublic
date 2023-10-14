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


import com.dao.ZuoweixinxiDao;
import com.entity.ZuoweixinxiEntity;
import com.service.ZuoweixinxiService;
import com.entity.vo.ZuoweixinxiVO;
import com.entity.view.ZuoweixinxiView;

@Service("zuoweixinxiService")
public class ZuoweixinxiServiceImpl extends ServiceImpl<ZuoweixinxiDao, ZuoweixinxiEntity> implements ZuoweixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweixinxiEntity> page = this.selectPage(
                new Query<ZuoweixinxiEntity>(params).getPage(),
                new EntityWrapper<ZuoweixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweixinxiEntity> wrapper) {
		  Page<ZuoweixinxiView> page =new Query<ZuoweixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweixinxiVO> selectListVO(Wrapper<ZuoweixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweixinxiVO selectVO(Wrapper<ZuoweixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweixinxiView> selectListView(Wrapper<ZuoweixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweixinxiView selectView(Wrapper<ZuoweixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
