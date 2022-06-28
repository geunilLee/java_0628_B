package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_여행_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
			고속버스를 타고 여행을 떠나려한다.
			출발시간까지 1시간 여유가 있다.
			고속버스역과 상점을 시속 3km 로 걸어서 왕복을하고,
			10분동안 물건을 산다고하면 
			역에서  1.3km 떨어진 상점을 다녀올수있나요?
		 */
		double a = (3/60.0);
		double b = (1.3/a); 
		System.out.println(b);
		
		int s = 10;
		int c = 60;
		System.out.println((b+s<c) +" " +  "상점에 다녀올수있다.");
		
		
	}
}