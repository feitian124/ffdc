package com.yunnuy.ffdc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunnuy.ffdc.model.Change;
import com.yunnuy.ffdc.repository.ChangeRepository;
import com.yunnuy.ffdc.service.ChangeService;

@Service
public class ChangeServiceImpl implements ChangeService {
	
	@Autowired
	private ChangeRepository changeRepository;
	
	public Iterable<Change> findAll() {
		return changeRepository.findAll();
	}

}
