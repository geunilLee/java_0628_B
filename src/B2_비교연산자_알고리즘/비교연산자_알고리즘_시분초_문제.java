package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_시분초_문제 {
	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 	321321초를  "시간" , "분" , "초" 로 표현햇을때 ,
		 *  "분" 이  홀수인가요?
		 */
		
		int 초 = 321321;
		int 분 = 초/60;
		int 시간 = 분/60;
		System.out.println(분);
		System.out.println(분%2 == 0);
	

	}
}