package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.ContactInfo;
import dmacc.beans.Worker;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Worker worker() { 
	Worker bean = new Worker("Beany");
	//bean.setName("Beanny");
	//bean.setDepartment("Accounting");
	//bean.setPosition("Accountant");
	//bean.setSupervisor("Bigger Beany");
	return bean;
	
	}
	@Bean
	public ContactInfo contactInfo() {
		ContactInfo info = new ContactInfo("123 Main Street, Des Moines, IA", "555-555-5555", "Ms Beany", "525-555-5555");
		return info;
		
}

}
