package com.test.practice;

public class Forloop10multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
int sum = 0;

for (i =0; i <=50 ; i++) {
	if(i % 5 == 0) {
	System.out.println(i);
	sum = sum + i;
}
	}
System.out.println(sum);

}
}