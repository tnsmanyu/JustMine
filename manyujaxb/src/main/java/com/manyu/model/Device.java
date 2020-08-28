package com.manyu.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "device")
public class Device {

	private int checked;
	private String deviceKey;
	private String deviceText;
	private String proof;
	
	@XmlAttribute
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	
	@XmlAttribute
	public String getDeviceKey() {
		return deviceKey;
	}
	public void setDeviceKey(String deviceKey) {
		this.deviceKey = deviceKey;
	}
	
	@XmlAttribute
	public String getDeviceText() {
		return deviceText;
	}
	public void setDeviceText(String deviceText) {
		this.deviceText = deviceText;
	}
	
	@XmlAttribute
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	
}