package com.yunnuy.ffdc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.yunnuy.ffdc.common.R;
import com.yunnuy.ffdc.model.Change;
import com.yunnuy.ffdc.service.ChangeService;

@RestController
@RequestMapping("changes")
public class ChangeController {
	
	@Autowired
	private ChangeService changeService;
	
	@GetMapping("index")
	public R index() {
		Iterable<Change> data = changeService.findAll();
		List<Change> list = Lists.newArrayList(data);
		R r = R.ok();
		r.put("list", list);
		return r;
	}

}
