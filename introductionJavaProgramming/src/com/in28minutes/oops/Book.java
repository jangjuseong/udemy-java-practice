package com.in28minutes.oops;

public class Book {
	void books() {
		System.out.println("북 인스턴스 생성");
	}

	private int noOfCopies;
	
	void getNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
}
