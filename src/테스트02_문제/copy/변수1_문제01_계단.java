package 테스트02_문제.copy;
/*
	[문제]
		철수와 영희는 가위바위보 게임을 하고 있다. 
		규칙은 아래와 같다.	
		
		[1] 이기면 계단을 3칸 올라간다.
		[2] 지면  계단을 2칸 내려간다.
		[3] 비기면 계단을 1칸 올라간다. 
		
		철수는 4번 이기고, 2번 비기고, 3번 졌다.
		50번 계단에서 시작했을 때,
	 	철수는 몇 번째 계단에 있는지 구하시오.
	 [정답] 
	 	58
 */
public class 변수1_문제01_계단 {
	public static void main(String[] args) {
		
		int up1 = 4*3;
		int up2 = 2*1;
		int down = 2*3;
		int 현재위치 = 50;
		System.out.println(현재위치+up1+up2-down);
			
     }
}