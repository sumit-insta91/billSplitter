package com.fc.billsplit.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_group")
public class UserGroup {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String groupData;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userGroupId")
    private Set<GroupExpense> groupExpense;
	private Date createdAt;
	private Date updateAt;
	
	public UserGroup() {
		super();
	}
	public UserGroup(int id, String groupData, Set<GroupExpense> groupExpense, Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.groupData = groupData;
		this.groupExpense = groupExpense;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupData() {
		return groupData;
	}
	public void setGroupData(String groupData) {
		this.groupData = groupData;
	}
	public Set<GroupExpense> getGroupExpense() {
		return groupExpense;
	}
	public void setGroupExpense(Set<GroupExpense> groupExpense) {
		this.groupExpense = groupExpense;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "UserGroup [id=" + id + ", groupData=" + groupData + ", groupExpense=" + groupExpense + ", createdAt="
				+ createdAt + ", updateAt=" + updateAt + "]";
	}
	
}
