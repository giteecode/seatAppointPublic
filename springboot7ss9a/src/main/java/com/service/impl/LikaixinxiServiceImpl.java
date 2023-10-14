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


import com.dao.LikaixinxiDao;
import com.entity.LikaixinxiEntity;
import com.service.LikaixinxiService;
import com.entity.vo.LikaixinxiVO;
import com.entity.view.LikaixinxiView;

@Service("likaixinxiService")
public class LikaixinxiServiceImpl extends ServiceImpl<LikaixinxiDao, LikaixinxiEntity> implements LikaixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LikaixinxiEntity> page = this.selectPage(
                new Query<LikaixinxiEntity>(params).getPage(),
                new EntityWrapper<LikaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LikaixinxiEntity> wrapper) {
		  Page<LikaixinxiView> page =new Query<LikaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LikaixinxiVO> selectListVO(Wrapper<LikaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LikaixinxiVO selectVO(Wrapper<LikaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LikaixinxiView> selectListView(Wrapper<LikaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LikaixinxiView selectView(Wrapper<LikaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
