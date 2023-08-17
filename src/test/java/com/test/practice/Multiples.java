package com.test.practice;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j =0;
		int sm= 0;

		while( j<= 50){
		if ( j % 5 == 0) {
		System.out.println("j is even number" + "" + j);
		}
		j ++;
		sm= sm + j;}
		System.out.println(sm); 
	}

}
