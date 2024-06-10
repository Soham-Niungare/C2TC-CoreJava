package com.day4;
/*
 * Flow control : Transfer statement
 * break statement
 * */
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		switch (x) {
		case 10:
			System.out.println(10);
			break;
		case 18:
			System.out.println(18);
			break;

		default:
			System.out.println("Invalid");
			break;
		}
		System.out.println("***********");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
//		int i=10;
//		if (i==10) {
//			break;
//		break cannot be used outside of a loop or a switch
//		}
	}

}