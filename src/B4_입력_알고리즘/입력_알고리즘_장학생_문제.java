package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_장학생_문제 {
	
	/*[문제] 
	 *  국어점수가 100점이거나 수학점수가 100점이면 장학생입니다.
	 *  아래 두학생의 시험점수가있습니다. 
	 *  각각의 학생은 장학생입니까?
          점수를 각각 입력받고 장학생인지 판별하는 식을 작성하세요.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int 국어장학 = 100;
		int 수학장학  = 100;
		
		System.out.println("국어점수입력 : ");
		int 국어점수 = scan.nextInt();
		
		System.out.println("수학점수입력 : ");
		int 수학점수 = scan.nextInt();
		
		System.out.println(국어점수 == 국어장학 || 수학점수 == 수학장학);
		
		

		
		
		
				
	}
}
