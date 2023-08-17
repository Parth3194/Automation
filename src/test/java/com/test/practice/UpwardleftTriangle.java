package com.test.practice;

public class UpwardleftTriangle {

	public static void main(String[] args) {
		  int row, column, numberOfRows = 6;
		    for (row=0; row<numberOfRows; row++)
		    {
		      for (column=2*(numberOfRows-row); column>2; column--)
		      {
		        System.out.print(" ");
		      }
		      for (column=0; column<=row; column++ )
		      {
		        System.out.print("* ");
		      }
		      System.out.println();
		    }
		  }
		}
