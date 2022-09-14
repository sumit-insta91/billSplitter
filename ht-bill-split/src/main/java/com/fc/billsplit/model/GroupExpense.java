package com.fc.billsplit.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="group_expense")
public class GroupExpense {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@ManyToOne
    @JoinColumn
    private UserGroup userGroupId;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "groupExpense")
    private Set<ExpenseTxnHistory> expenseTxnHistories;
	
	private String userName;
	
	@Column(length = 10)
	private int mobileNo;
	
	private Double amount;
	private String isAdmin;
	private String metadata;
	private Date createdAt;
	private Date updateAt;
	
	public GroupExpense() {
		super();
	}
	
	
	public GroupExpense(int id, UserGroup userGroupId, String userName, int mobileNo, Double amount, String isAdmin,
			String metadata, Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.userGroupId = userGroupId;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.amount = amount;
		this.isAdmin = isAdmin;
		this.metadata = metadata;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserGroup getUserGroupId() {
		return userGroupId;
	}
	public void setUserGroupId(UserGroup userGroupId) {
		this.userGroupId = userGroupId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getMetadata() {
		return metadata;
	}
	public void setMetadata(String metadata) {
		this.metadata = metadata;
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
		return "GroupExpense [id=" + id + ", userGroupId=" + userGroupId + ", userName=" + userName + ", mobileNo="
				+ mobileNo + ", amount=" + amount + ", isAdmin=" + isAdmin + ", metadata=" + metadata + ", createdAt="
				+ createdAt + ", updateAt=" + updateAt + "]";
	}

	
}
