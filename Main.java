package com.ultron;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = scan.nextLine();
		System.out.println("Enter Your Age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Your Blood Group");
		String bloodGroup = scan.nextLine();
		String group ="" ;
		if(age>=20) {
			group = "RED";
		}else if(age>=15 && age<20){
			group = "BLUE";
		}else if(age>=10 && age<15) {
			group = "YELLOW";
		}else {
			System.out.println("Entered age id invalid");
		}
		System.out.println("----------------------");
		System.out.println(" Name: "+name);
		System.out.println(" Age: "+age);
		System.out.println(" Blood Group: "+bloodGroup);
		System.out.println("----------------------");
		System.out.println("  Your group is "+group);
		System.out.println("----------------------");
		scan.close();
	}

}
