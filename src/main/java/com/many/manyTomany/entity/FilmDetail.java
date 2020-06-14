package com.many.manyTomany.entity;

import java.util.List;

public class FilmDetail extends Film {
	
	private int filmDetailId;
	private List<Actor> actorList;
	private List<Category> categoryList;
	private Language language;
//	private Language originalLanguage;
	
	
	public List<Actor> getActorList() {
		return actorList;
	}
	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}
	public List<Category> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(List<Category> categoryList) {
		this.categoryList = categoryList;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
//	public Language getOriginalLanguage() {
//		return originalLanguage;
//	}
//	public void setOriginalLanguage(Language originalLanguage) {
//		this.originalLanguage = originalLanguage;
//	}
	
	
	
	
	
	

}
