package com.pro.milkmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Request {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;		
	private Long userId;	
	private Long milkManId;	
	private Boolean isAccepted;
	@Override
	public String toString() {
		return "Request [id=" + id + ", userId=" + userId + ", milkManId=" + milkManId + ", isAccepted=" + isAccepted
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getMilkManId() {
		return milkManId;
	}
	public void setMilkManId(Long milkManId) {
		this.milkManId = milkManId;
	}
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
}
