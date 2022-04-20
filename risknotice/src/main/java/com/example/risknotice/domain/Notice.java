package com.example.risknotice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String priority;
	private String description;
	
	public Notice(Long id) {
		super();
		this.id = id;
	}
	
	public Notice() {}
	
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
	
	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Notice(String title, String priority, String description) {
		super();
		this.title = title;
		this.priority = priority;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", priority=" + priority + ", description=" + description
				+ "]";
	}
	
	

}
