package B2_비교연산자_알고리즘;

public class 비교연산자_알고리즘_과일무게_문제 {
	public static void main(String[] args) {
		/*
			[문제]
				귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
		 		귤 4개의 무개가 사과 2개의 무게보다 큽니까??
		 */
		
		double 귤1 = 840/6.0;
		double 사과1 = 750/3.0;
		double 귤4 = 귤1*4;
		double 사과2 = 사과1*2;
		
		System.out.println(귤4>사과2);

		
	}
}