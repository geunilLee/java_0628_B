package B3_논리연산자_프로젝트;

public class 논리연산자_프로젝트_과일가격_문제 {
	/*
	 * [문제]
	 * 사과1개와 바나나3개의 값은 5500원이고,
	 * 사과1개와 바나나5개의 값은 8500원이다.
	 * 각각의 과일가격을 구하시오.
	 */
	public static void main(String[] args) {
		

		int 바나나두개 = 8500-5500;
		int 바나나한개 = 바나나두개/2;
		
		int 사과한개 = 5500-바나나한개*3;
		System.out.println("사과 한개 : " + 사과한개);
		System.out.println("바나나 한개 : " + 바나나한개);
		
		
	}
}