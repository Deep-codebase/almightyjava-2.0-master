package com.mightyjava.model;

public class VideoDTO {

	private Long id;

	private String title;

	public VideoDTO(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "VideoDTO [id=" + id + ", title=" + title + "]";
	}

}
