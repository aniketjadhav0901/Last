package com.vella;
import java.util.*;

public class CheckInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number ");
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			System.out.println("Number is Integer");
		}
		else
		{
			System.out.println("Number is not Integer");
		}
	}

}
