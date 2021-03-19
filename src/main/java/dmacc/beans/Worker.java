package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
@Entity
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String department;
	private String position;
	private String supervisor;
	@Autowired
	private ContactInfo contactInfo;
	
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name) {
		super();
		this.name = name;
		
	}

	public Worker(String name, String department, String position, String supervisor) {
		super();
		this.name = name;
		this.department = department;
		this.position = position;
		this.supervisor = supervisor;
	}

	public Worker(int id, String name, String department, String position, String supervisor) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.position = position;
		this.supervisor = supervisor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", department=" + department + ", position=" + position
				+ ", supervisor=" + supervisor + ", contactInfo=" + contactInfo + "]";
	}

	
	
	
	
	
	

}
