package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_합_문제 {
	/*
		[문제]
		 숫자 2개를 입력받는다. 두숫자의 합을구하시오.

	 */
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("숫자를입력하시오 : ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자를입력하시오 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1+num2);
		
		
	
	}
}