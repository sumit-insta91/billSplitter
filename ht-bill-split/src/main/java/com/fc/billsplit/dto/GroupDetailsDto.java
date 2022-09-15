package com.fc.billsplit.dto;

import java.util.List;

public class GroupDetailsDto {

    private int groupId;
    private String groupName;
    private List<UserExpenseDetailsDto> userExpenseDetailsDto;

    public GroupDetailsDto() {
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<UserExpenseDetailsDto> getUserExpenseDetailsDto() {
        return userExpenseDetailsDto;
    }

    public void setUserExpenseDetailsDto(List<UserExpenseDetailsDto> userExpenseDetailsDto) {
        this.userExpenseDetailsDto = userExpenseDetailsDto;
    }
}

