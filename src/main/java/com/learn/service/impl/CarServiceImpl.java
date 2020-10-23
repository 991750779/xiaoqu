package com.learn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

					            import com.learn.service.SysUserService;
		

import com.learn.dao.CarDao;
import com.learn.entity.CarEntity;
import com.learn.service.CarService;



@Service("carService")
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDao carDao;

															            @Autowired
            private SysUserService sysUserService;
						

	
	@Override
	public CarEntity queryObject(Long id){
			CarEntity entity = carDao.queryObject(id);

															            if (this.sysUserService.queryObject(entity.getUser()) != null)
                entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
						
		return entity;
	}
	
	@Override
	public List<CarEntity> queryList(Map<String, Object> map){
        List<CarEntity> list = carDao.queryList(map);
        for(CarEntity entity : list){
																																			                    if (this.sysUserService.queryObject(entity.getUser()) != null)
                        entity.setSysUserEntity(this.sysUserService.queryObject(entity.getUser()));
																}
		return list;
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return carDao.queryTotal(map);
	}
	
	@Override
	public void save(CarEntity car){
		carDao.save(car);
	}
	
	@Override
	public void update(CarEntity car){
		carDao.update(car);
	}
	
	@Override
	public void delete(Long id){
		carDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		carDao.deleteBatch(ids);
	}
	
}
