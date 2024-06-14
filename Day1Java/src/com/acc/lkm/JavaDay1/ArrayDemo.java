package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class ArrayDemo {
  
  
	public static void main(String[] args) {
		int len,p,element;
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the length of an Array:");
		  len=scan.nextInt();
		  int arr[]=new int[len+1];
		  System.out.println("Enter "+len+" elements:");
		  for(int i=0;i<len;i++) {
			  arr[i]=scan.nextInt();
		  }
		  System.out.println("Enter the element which you want to insert:");
		  element=scan.nextInt();
		  arr[len]=element;
		  System.out.println("After inserting the last element");
		  for(int i=0;i<len;i++) {
			  System.out.println(arr[i]+",");
		  }
		  System.out.println(arr[len]);

	}

}
