package B1_변수_알고리즘;

public class 변수_알고리즘_봉사활동_문제 {
	public static void main(String[] args) {		
		/*
		 * [문제]
		 * 철수 반학생은 16명이다.
		 * 8명은 양로원에 봉사활동을 다녀왔고
		 * 4명은 지하철 봉사활동을 다녀왔다. 
		 * 봉사활동을 다녀오지않은 학생의 비율은 몇%인가  
		 */
		
		int 반학생 = 16;
		int 양로원 = 8;
		int 지하철 = 4;
		double 봉사안한사람 = 반학생- 양로원 - 지하철;
		System.out.println(봉사안한사람/반학생*100);
		

		
     }
}