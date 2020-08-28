package com.manyu.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sharedDataQuestion")
public class SharedDataQuestion {

	private String sharedDataText;

	@XmlAttribute
	public String getSharedDataText() {
		return sharedDataText;
	}

	public void setSharedDataText(String sharedDataText) {
		this.sharedDataText = sharedDataText;
	}
}
