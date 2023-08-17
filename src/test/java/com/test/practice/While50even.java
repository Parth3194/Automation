package com.test.practice;

public class While50even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
		int sm= 0;

		while( j<= 50){
		if ( j % 2 == 0) {
		System.out.println("j is even number" + "" + j);
		}
		j ++;
		sm= sm + j;}
		System.out.println(sm); 
	}

}
