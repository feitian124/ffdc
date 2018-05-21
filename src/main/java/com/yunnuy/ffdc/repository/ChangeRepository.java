package com.yunnuy.ffdc.repository;

import org.springframework.data.repository.CrudRepository;

import com.yunnuy.ffdc.model.Change;
import com.yunnuy.ffdc.model.ChangePrimarykey;

public interface  ChangeRepository extends CrudRepository<Change, ChangePrimarykey> {

}
