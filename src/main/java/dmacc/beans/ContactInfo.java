package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 18, 2021
 */
@Embeddable
public class ContactInfo {
	private String address;
	private String phone;
	private String contact;
	private String contactPhone;
	
	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactInfo(String address, String phone, String contact, String contactPhone) {
		super();
		this.address = address;
		this.phone = phone;
		this.contact = contact;
		this.contactPhone = contactPhone;
	}

	@Override
	public String toString() {
		return "ContactInfo [address=" + address + ", phone=" + phone + ", contact=" + contact + ", contactPhone="
				+ contactPhone + "]";
	}
	
	
	
	

}
