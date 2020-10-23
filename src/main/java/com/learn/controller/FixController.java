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

import com.learn.entity.FixEntity;
import com.learn.service.FixService;
import com.learn.utils.PageUtils;
import com.learn.utils.Query;
import com.learn.utils.R;


/**
 * 报修信息
 * 
 */
@RestController
@RequestMapping("fix")
public class FixController extends AbstractController {
	@Autowired
	private FixService fixService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){

																				                if (super.getUserId() > 1)
                    params.put("user", super.getUserId());
															

		//查询列表数据
        Query query = new Query(params);

		List<FixEntity> fixList = fixService.queryList(query);
		int total = fixService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(fixList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	

	/**
	 * 列表
	 */
	@RequestMapping("/list2")
	public R list2(@RequestParam Map<String, Object> params){
        Query query = new Query(params);
		List<FixEntity> fixList = fixService.queryList(query);
		return R.ok().put("list", fixList );
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		FixEntity fix = fixService.queryObject(id);
		
		return R.ok().put("fix", fix);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody FixEntity fix){

																				                if (fix.getUser() == null)
                    fix.setUser(super.getUserId());
															

        fixService.save(fix);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody FixEntity fix){
		fixService.update(fix);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Long[] ids){
		fixService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
