package 테스트02_문제.copy;
/*
	[문제]
		가게 A 에서 한개에 1000원인 음료수가 가게B 에서는 한개에 500원이라고한다.
	 	가게 B 에 다녀오려면 왕복 교통비가 1600원이 들때, 음료수를 x개이상 살경우
	 	가게 B 에서 사는것이 더 유리한지 구하시오.
	 	주석으로 표현하시오.
*/
public class 비교연산자3_문제02_음료수 {
	public static void main(String[] args) {
		
		/*
		 * [주석]
		 * a 값이 b보다 커질때부터 b가 이득이된다
		 * a>b가 트루
		 * 
		 * x>4
		 * x<=4 이면 성립된다
		 * 4개 이상부터 구매시 b가 더이득이다
		 */
		
		int x = 4;
		int a = 1000*x;
		int b = 500*x+1600;
		
		    System.out.println(a > b );
		    
		
		
		
	}
}