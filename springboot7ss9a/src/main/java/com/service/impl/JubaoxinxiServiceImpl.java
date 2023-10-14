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


import com.dao.JubaoxinxiDao;
import com.entity.JubaoxinxiEntity;
import com.service.JubaoxinxiService;
import com.entity.vo.JubaoxinxiVO;
import com.entity.view.JubaoxinxiView;

@Service("jubaoxinxiService")
public class JubaoxinxiServiceImpl extends ServiceImpl<JubaoxinxiDao, JubaoxinxiEntity> implements JubaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JubaoxinxiEntity> page = this.selectPage(
                new Query<JubaoxinxiEntity>(params).getPage(),
                new EntityWrapper<JubaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JubaoxinxiEntity> wrapper) {
		  Page<JubaoxinxiView> page =new Query<JubaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JubaoxinxiVO> selectListVO(Wrapper<JubaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JubaoxinxiVO selectVO(Wrapper<JubaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JubaoxinxiView> selectListView(Wrapper<JubaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JubaoxinxiView selectView(Wrapper<JubaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
