package com.manyu.main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.manyu.model.Device;
import com.manyu.model.SecureHomeQuestions;

public class App {

	public static void main(String[] args) throws Exception {
		String fileName = "sample.xml";
        ClassLoader classLoader = App.class.getClassLoader();
 
        File file = new File(classLoader.getResource(fileName).getFile());
         JAXBContext jaxbContext = JAXBContext.newInstance(SecureHomeQuestions.class);    
      
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
         SecureHomeQuestions xmltoobj =(SecureHomeQuestions) jaxbUnmarshaller.unmarshal(file);    
		
         System.out.println(xmltoobj.getPerilCount());
         System.out.println(xmltoobj.getPerils().size());
         
         for (Device device : xmltoobj.getPerils().get(0).getDevices()) {
			System.out.println(device.getDeviceText());
		}
	}

}
