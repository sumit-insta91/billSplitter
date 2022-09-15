package com.fc.billsplit.dao;

import com.fc.billsplit.model.GroupExpense;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupExpenseRepository extends CrudRepository<GroupExpense,Integer> {

    public List<GroupExpense> findByUserGroupIdId(Integer userGroupIdId);
}
