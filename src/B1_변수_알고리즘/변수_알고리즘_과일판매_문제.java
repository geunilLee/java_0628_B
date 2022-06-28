package B1_변수_알고리즘;

public class 변수_알고리즘_과일판매_문제 {
	public static void main(String[] args) {	
	
		/*
		   [문제]
		 - 가게에 과일 250개가 있다. 
		 - 그중에 오전에 120개가 팔렸고 오후에는  80개가 팔렸다.
		 - 남은 과일는 전체 과일의 몇 % 인가?
		 */
		
		int 전체과일 = 250;
		int 오전판매 = 120;
		int 오후판매 = 80;
		double 남은과일 = 전체과일 - 오전판매 - 오후판매;
		System.out.println((남은과일/전체과일)*100);
		
		
		
		
		
		
		
			
     }
}