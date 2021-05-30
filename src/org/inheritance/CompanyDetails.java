package org.inheritance;

public class CompanyDetails extends CompanyBankDetails {
	public void comName() {
		System.out.println("TCS");
	}
		   
	public void comAddress() {
		System.out.println("Vadapalani");
	}
	@Override
	public void deposite() {
		System.out.println("54%");
	}
	public static void main(String[] args) {
		CompanyDetails c = new CompanyDetails();
		c.comName();
		c.comAddress();
		c.deposite();
				
	}

}
