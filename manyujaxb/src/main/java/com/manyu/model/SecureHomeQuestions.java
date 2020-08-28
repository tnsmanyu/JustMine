package com.manyu.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "secureHomeQuestions")
public class SecureHomeQuestions {
	
	private int perilCount;

	@XmlAttribute
	public int getPerilCount() {
		return perilCount;
	}

	public void setPerilCount(int perilCount) {
		this.perilCount = perilCount;
	}
	
	private List<Peril> perils;

	@XmlElement(name = "peril")
	public List<Peril> getPerils() {
		return perils;
	}

	public void setPerils(List<Peril> perils) {
		this.perils = perils;
	}

	private SharedDataQuestion sharedDataQuestion;
	
	@XmlElement
	public SharedDataQuestion getSharedDataQuestion() {
		return sharedDataQuestion;
	}

	public void setSharedDataQuestion(SharedDataQuestion sharedDataQuestion) {
		this.sharedDataQuestion = sharedDataQuestion;
	}
	
}
