package B4_입력_알고리즘;

import java.util.Scanner;

public class 입력_알고리즘_로그인_문제 {
	/*		 
	 * [문제] 
	 * 		철수는 로그인을 하려고 한다. 
	 * 		아이디와 비밀번호를 입력받는다. 
	 * 		아이디와 비밀번호 둘중하나만틀려도 로그인은 실패합니다.
	 * 		철수는 로그인을 성공할까요?
	 * 		joinId 와 joinPw 는 철수가 이미가입한 아이디와 비밀번호입니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int joinId = 1234;
		int joinPw = 4321;
		
		//안내문1
		System.out.println("아이디를 입력 : ");
		int logId = scan.nextInt();
		//안내문2
		System.out.println("비밀번호를 입력 : ");
		int logPw = scan.nextInt();
		
		//로그아디는 조인아디랑 같아야되고, 로그비번은 조인비번과 같아야된다.
		System.out.println(joinId == logId && joinPw == logPw);
		
		
		

		
	}
}