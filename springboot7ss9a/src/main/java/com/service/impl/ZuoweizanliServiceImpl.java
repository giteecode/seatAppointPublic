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


import com.dao.ZuoweizanliDao;
import com.entity.ZuoweizanliEntity;
import com.service.ZuoweizanliService;
import com.entity.vo.ZuoweizanliVO;
import com.entity.view.ZuoweizanliView;

@Service("zuoweizanliService")
public class ZuoweizanliServiceImpl extends ServiceImpl<ZuoweizanliDao, ZuoweizanliEntity> implements ZuoweizanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweizanliEntity> page = this.selectPage(
                new Query<ZuoweizanliEntity>(params).getPage(),
                new EntityWrapper<ZuoweizanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweizanliEntity> wrapper) {
		  Page<ZuoweizanliView> page =new Query<ZuoweizanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweizanliVO> selectListVO(Wrapper<ZuoweizanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweizanliVO selectVO(Wrapper<ZuoweizanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweizanliView> selectListView(Wrapper<ZuoweizanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweizanliView selectView(Wrapper<ZuoweizanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
