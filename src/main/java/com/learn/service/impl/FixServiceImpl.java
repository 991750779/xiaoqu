package com.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

				            import com.learn.service.SysUserService;
			

import com.learn.dao.FixDao;
import com.learn.entity.FixEntity;
import com.learn.service.FixService;



@Service("fixService")
public class FixServiceImpl implements FixService {
	@Autowired
	private FixDao fixDao;

												            @Autowired
            private SysUserService sysUserService;
									

	
	@Override
	public FixEntity queryObject(Long id){
			FixEntity entity = fixDao.queryObject(id);

												            if (this.sysUserService.queryObject(entity.getUser()) != null)
                entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
									
		return entity;
	}
	
	@Override
	public List<FixEntity> queryList(Map<String, Object> map){
        List<FixEntity> list = fixDao.queryList(map);
        for(FixEntity entity : list){
																												                    if (this.sysUserService.queryObject(entity.getUser()) != null)
                        entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
																							}
		return list;
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return fixDao.queryTotal(map);
	}
	
	@Override
	public void save(FixEntity fix){
		fixDao.save(fix);
	}
	
	@Override
	public void update(FixEntity fix){
		fixDao.update(fix);
	}
	
	@Override
	public void delete(Long id){
		fixDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		fixDao.deleteBatch(ids);
	}
	
}
