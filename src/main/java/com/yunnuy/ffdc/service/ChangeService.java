package com.yunnuy.ffdc.service;

import com.yunnuy.ffdc.model.Change;

public interface ChangeService {
	Iterable<Change> findAll();
}
