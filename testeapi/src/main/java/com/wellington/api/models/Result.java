package com.wellington.api.models;

public class Result {
	private String title;
	private String title_with_featured;
	
	
	public Result(String string) {
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_with_featured() {
		return title_with_featured;
	}
	public void setTitle_with_featured(String title_with_featured) {
		this.title_with_featured = title_with_featured;
	}
	
}
