package com.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

				            import com.learn.service.SysUserService;
			

import com.learn.dao.TsDao;
import com.learn.entity.TsEntity;
import com.learn.service.TsService;



@Service("tsService")
public class TsServiceImpl implements TsService {
	@Autowired
	private TsDao tsDao;

												            @Autowired
            private SysUserService sysUserService;
									

	
	@Override
	public TsEntity queryObject(Long id){
			TsEntity entity = tsDao.queryObject(id);

												            if (this.sysUserService.queryObject(entity.getUser()) != null)
                entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
									
		return entity;
	}
	
	@Override
	public List<TsEntity> queryList(Map<String, Object> map){
        List<TsEntity> list = tsDao.queryList(map);
        for(TsEntity entity : list){
																												                    if (this.sysUserService.queryObject(entity.getUser()) != null)
                        entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
																							}
		return list;
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return tsDao.queryTotal(map);
	}
	
	@Override
	public void save(TsEntity ts){
		tsDao.save(ts);
	}
	
	@Override
	public void update(TsEntity ts){
		tsDao.update(ts);
	}
	
	@Override
	public void delete(Long id){
		tsDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		tsDao.deleteBatch(ids);
	}
	
}
