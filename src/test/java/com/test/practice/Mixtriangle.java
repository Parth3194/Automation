package com.test.practice;

public class Mixtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size = 5;
		    for (int i = 0; i < size; i++) {
		   for (int j = 0; j < i; j++) {
			   System.out.print(" ");
		      }
		    
		      for (int k = 0; k < (size - i) * 2 - 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		 
		    for (int i = 2; i <= size; i++) {
		     
		      for (int j = size; j > i; j--) {
		        System.out.print(" ");
		      }
		      
		      for (int k = 0; k < i * 2 - 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		 
	}
}
