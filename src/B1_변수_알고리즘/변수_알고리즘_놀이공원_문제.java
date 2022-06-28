package B1_변수_알고리즘;

public class 변수_알고리즘_놀이공원_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
		 * 	철수는 놀이공원에 갔습니다. 
		 *  놀이공원 입장료는 15000원 입니다.
		 *  철수는 이런저런 할인을 받아서 9000원에 입장했습니다.
		 *  몇 % 할인받은것일까요?
		 */

		int 입장료 = 15000;
		double 할인금액 = 9000;
		double 할인율 = 할인금액/입장료 * 100;
		System.out.println(할인율);
		
		
		

	}
}