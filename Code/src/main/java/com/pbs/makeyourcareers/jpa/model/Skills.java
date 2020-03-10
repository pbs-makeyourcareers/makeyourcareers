package com.pbs.makeyourcareers.jpa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skills implements java.io.Serializable {

	private static final long serialVersionUID = 328535440412703174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String skillsName;

	private String skillsDesc;

	private Date createDate;
	
	private Boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_stream_Id", nullable = false)
	private QuestionStream questionStream;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkillsName() {
		return skillsName;
	}

	public void setSkillsName(String skillsName) {
		this.skillsName = skillsName;
	}

	public String getSkillsDesc() {
		return skillsDesc;
	}

	public void setSkillsDesc(String skillsDesc) {
		this.skillsDesc = skillsDesc;
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

	public QuestionStream getQuestionStream() {
		return questionStream;
	}

	public void setQuestionStream(QuestionStream questionStream) {
		this.questionStream = questionStream;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", skillsName=" + skillsName + ", skillsDesc=" + skillsDesc + ", createDate="
				+ createDate + ", isActive=" + isActive + ", questionStream=" + questionStream + "]";
	}

	
	
}
