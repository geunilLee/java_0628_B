package B4_입력_프로젝트;

import java.util.Scanner;

public class 입력_평가문제_오류_해설2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * [문제] 
		 * 		숫자 3개를 입력받는다.
		 * 		그숫자중에 한개의 숫자라도 홀수가있으면 오류입니다.
		 * 		아래숫자들은오류가 있나요?
		 */
		
		//안내문1
		System.out.println("숫자1 입력하시오 : ");
		//숫자1입력
		int n1 = scan.nextInt();
		//안내문2
		System.out.println("숫자2 입력하시오 : ");
		//숫자2입력
		int n2 = scan.nextInt();
		//안내문2
		System.out.println("숫자3 입력하시오 : ");
		//숫자3입력
		int n3 = scan.nextInt();
		// 하나라도 홀수면 false, 그러므로 모두다 짝수여야한다.	
		System.out.println(n1%2 == 0 && n2%2 == 0 && n3%2 == 0);
		
		
		
		
		
	}
}