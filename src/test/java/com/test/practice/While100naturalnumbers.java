package com.test.practice;

public class While100naturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int sum = 0;
int i = 1;

while (i <= 100) {
	
	System.out.println("Natural number is" + " "+ i );
	i++;
	sum = sum + i;
	}

System.out.println(sum);
	}
	}
