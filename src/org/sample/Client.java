package org.sample;

import org.testing.company;

public class Client extends company {
	
	private void cliId() {
		System.out.println("Client ID : 123");
	}
	
	private void cliName() {
		System.out.println("Client Name : SK");
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		c.comId();
		c.comName();
		c.cliId();
		c.cliName();
		c.empId();
		c.empName();
	}

}
