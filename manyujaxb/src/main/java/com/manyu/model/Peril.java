package com.manyu.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "peril")
public class Peril {
	
	private int deviceCount;
	
	@XmlAttribute
	public int getDeviceCount() {
		return deviceCount;
	}
	public void setDeviceCount(int deviceCount) {
		this.deviceCount = deviceCount;
	}
	
	private String perilType;
	
	@XmlAttribute
	public String getPerilType() {
		return perilType;
	}
	public void setPerilType(String perilType) {
		this.perilType = perilType;
	}
	
	private List<Device> devices;
	
	@XmlElement(name = "device")
	public List<Device> getDevices() {
		return devices;
	}
	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
	
	
}
