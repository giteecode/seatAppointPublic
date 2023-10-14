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


import com.dao.XinyongjianfenDao;
import com.entity.XinyongjianfenEntity;
import com.service.XinyongjianfenService;
import com.entity.vo.XinyongjianfenVO;
import com.entity.view.XinyongjianfenView;

@Service("xinyongjianfenService")
public class XinyongjianfenServiceImpl extends ServiceImpl<XinyongjianfenDao, XinyongjianfenEntity> implements XinyongjianfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinyongjianfenEntity> page = this.selectPage(
                new Query<XinyongjianfenEntity>(params).getPage(),
                new EntityWrapper<XinyongjianfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinyongjianfenEntity> wrapper) {
		  Page<XinyongjianfenView> page =new Query<XinyongjianfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinyongjianfenVO> selectListVO(Wrapper<XinyongjianfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinyongjianfenVO selectVO(Wrapper<XinyongjianfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinyongjianfenView> selectListView(Wrapper<XinyongjianfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinyongjianfenView selectView(Wrapper<XinyongjianfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
