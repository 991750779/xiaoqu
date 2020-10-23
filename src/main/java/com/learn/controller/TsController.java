package com.learn.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity.TsEntity;
import com.learn.service.TsService;
import com.learn.utils.PageUtils;
import com.learn.utils.Query;
import com.learn.utils.R;


/**
 * 投诉信息
 * 
 */
@RestController
@RequestMapping("ts")
public class TsController extends AbstractController {
	@Autowired
	private TsService tsService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){

																				                if (super.getUserId() > 1)
                    params.put("user", super.getUserId());
															

		//查询列表数据
        Query query = new Query(params);

		List<TsEntity> tsList = tsService.queryList(query);
		int total = tsService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(tsList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	

	/**
	 * 列表
	 */
	@RequestMapping("/list2")
	public R list2(@RequestParam Map<String, Object> params){
        Query query = new Query(params);
		List<TsEntity> tsList = tsService.queryList(query);
		return R.ok().put("list", tsList );
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		TsEntity ts = tsService.queryObject(id);
		
		return R.ok().put("ts", ts);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody TsEntity ts){

																				                if (ts.getUser() == null)
                    ts.setUser(super.getUserId());
															

        tsService.save(ts);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody TsEntity ts){
		tsService.update(ts);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Long[] ids){
		tsService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
