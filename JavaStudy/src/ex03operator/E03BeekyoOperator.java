package ex03operator;

public class E03BeekyoOperator {

	public static void main(String[] args) {

		/*
		 비교연산자 : 두개의 변수를 서로 비교하여 값이 크거나 
		 	같은지 판단하는 연산자
		 ! : 부정연산자 다른지 판단 (not)
		 == : 같은지 판단
		 */
		int num1=10, num2=20;
		
		if(num1>num2) {
			System.out.println("num1이 더 큽니다");
		}
		else {
			System.out.println("num2가 더 큽니다");
		}
		
		if(num1!=num2) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다");
		}
	}

}
