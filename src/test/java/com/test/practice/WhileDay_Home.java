package com.test.practice;

public class WhileDay_Home {

	public static void main(String[] args) {
		int i = 10;
		int j = --i - i++;
	//      j = 9   - 10 = -1	
	//      i = 9
		int k = i-- - --i + i++ - --j;
	//      k = 9   -   8 + 9   - (-2) = 
		int l = i++ + j++ + --j - --k - --i;
	//      l = 9   + -2  + -3  -      - 8
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}