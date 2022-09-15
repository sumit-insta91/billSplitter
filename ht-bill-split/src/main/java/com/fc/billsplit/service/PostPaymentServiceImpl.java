package com.fc.billsplit.service;

import com.fc.billsplit.dao.GroupExpenseRepository;
import com.fc.billsplit.dao.UserGroupRepository;
import com.fc.billsplit.dto.GroupDetailsDto;
import com.fc.billsplit.model.GroupExpense;
import com.fc.billsplit.model.UserGroup;
import com.fc.billsplit.util.PostPaymentUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostPaymentServiceImpl implements PostPaymentService {

  @Autowired
  private GroupExpenseRepository groupExpenseRepository;

  @Autowired
  private UserGroupRepository userGroupRepository;

  @Override
  public GroupDetailsDto getGroupDetails(int groupId) {

    if (groupId == 0) return null;

    Optional<UserGroup> userGroupOptional = userGroupRepository.findById(groupId);

    if (!userGroupOptional.isPresent()) return null;

    UserGroup userGroup = userGroupOptional.get();

    List<GroupExpense> groupExpenseList = groupExpenseRepository.findByUserGroupIdId(groupId);

    if (groupExpenseList.size() == 0) return null;

    return PostPaymentUtility.convertGroupDetails(userGroup, groupExpenseList);
  }
}
