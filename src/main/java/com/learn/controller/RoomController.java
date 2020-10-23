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

import com.learn.entity.RoomEntity;
import com.learn.service.RoomService;
import com.learn.utils.PageUtils;
import com.learn.utils.Query;
import com.learn.utils.R;


/**
 * 房间信息
 * 
 */
@RestController
@RequestMapping("room")
public class RoomController extends AbstractController {
	@Autowired
	private RoomService roomService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	public R list(@RequestParam Map<String, Object> params){

																						

		//查询列表数据
        Query query = new Query(params);

		List<RoomEntity> roomList = roomService.queryList(query);
		int total = roomService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(roomList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	

	/**
	 * 列表
	 */
	@RequestMapping("/list2")
	public R list2(@RequestParam Map<String, Object> params){
        Query query = new Query(params);
		List<RoomEntity> roomList = roomService.queryList(query);
		return R.ok().put("list", roomList );
	}


	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	public R info(@PathVariable("id") Long id){
		RoomEntity room = roomService.queryObject(id);
		
		return R.ok().put("room", room);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	public R save(@RequestBody RoomEntity room){

																						

        roomService.save(room);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	public R update(@RequestBody RoomEntity room){
		roomService.update(room);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	public R delete(@RequestBody Long[] ids){
		roomService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
