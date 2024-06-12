package com.DayFive;

/*
 * Flow control : Iterative statement
 * for loop & for-each loop
 * */
public class Matrix {

//	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = { { 10, 20, 30, 40 }, { 50, 60 } };
		label1: for (int i = 0; i < x.length; i++) {
			label2: for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		for (int[] x1 : x) {
			for (int x2 : x1) {
				System.out.print(x2 + " ");
			}
			System.out.println();
		}
	}

}