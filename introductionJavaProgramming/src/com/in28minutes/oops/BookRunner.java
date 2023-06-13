package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.books();
		effectiveJava.books();
		cleanCode.books();
		
		artOfComputerProgramming.getNoOfCopies(10);
		effectiveJava.getNoOfCopies(3);
		cleanCode.getNoOfCopies(20);

	}

}
