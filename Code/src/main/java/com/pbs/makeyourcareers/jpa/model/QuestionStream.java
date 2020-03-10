package com.pbs.makeyourcareers.jpa.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class QuestionStream implements java.io.Serializable {

	private static final long serialVersionUID = 328535440412703174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String questionStreamName;

	private String questionStreamDesc;

	private Date createDate;
	
	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_type_id", nullable = false)
	private QuestionType questionType;
	
	@OneToMany(mappedBy="questionStream")
    private Set<Skills> skills;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getQuestionStreamName() {
		return questionStreamName;
	}

	public void setQuestionStreamName(String questionStreamName) {
		this.questionStreamName = questionStreamName;
	}

	public String getQuestionStreamDesc() {
		return questionStreamDesc;
	}

	public void setQuestionStreamDesc(String questionStreamDesc) {
		this.questionStreamDesc = questionStreamDesc;
	}


	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	@Override
	public String toString() {
		return "QuestionStream [id=" + id + ", questionStreamName=" + questionStreamName + ", questionStreamDesc="
				+ questionStreamDesc + ", createDate=" + createDate + ", isActive=" + isActive + ", questionType="
				+ questionType + "]";
	}
	
}
