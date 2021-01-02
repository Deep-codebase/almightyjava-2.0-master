package com.mightyjava.model;

import java.util.List;

public class BlogDTO {
	private Long id;
	private String fullName;
	private String userId;
	private String userName;
	private String mobile;
	private List<VideoDTO> videolist;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
	public List<VideoDTO> getVideolist() {
		return videolist;
	}
	public void setVideolist(List<VideoDTO> videolist) {
		this.videolist = videolist;
	}
	@Override
	public String toString() {
		return "BlogDTO [id=" + id + ", fullName=" + fullName + ", userId=" + userId + ", userName=" + userName
				+ ", mobile=" + mobile + ", videolist=" + videolist + "]";
	}
		
	
}
