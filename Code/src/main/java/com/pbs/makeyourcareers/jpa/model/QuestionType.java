package com.pbs.makeyourcareers.jpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class QuestionType implements java.io.Serializable {

	private static final long serialVersionUID = 328535440412703174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String questionTypeName;

	private String questionTypeDesc;

	private Date createDate;
	
	private Boolean isActive;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionTypeName() {
		return questionTypeName;
	}

	public void setQuestionTypeName(String questionTypeName) {
		this.questionTypeName = questionTypeName;
	}

	public String getQuestionTypeDesc() {
		return questionTypeDesc;
	}

	public void setQuestionTypeDesc(String questionTypeDesc) {
		this.questionTypeDesc = questionTypeDesc;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "QuestionType [id=" + id + ", questionTypeName=" + questionTypeName + ", questionTypeDesc="
				+ questionTypeDesc + ", createDate=" + createDate + ", isActive=" + isActive + "]";
	}

	
}
