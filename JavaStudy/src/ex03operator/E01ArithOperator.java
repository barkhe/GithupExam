package ex03operator;

public class E01ArithOperator {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 3;
		
		System.out.println("덧셈:"+(num1+num2));
		System.out.println("뺄셈:"+(num1-num2));
		System.out.println("곱셈:"+(num1*num2));
		/*
		 나눗셈 연산 정수 정수 연산 결과 정수
		 실수 얻으려면 실수 정슈 / 강제형변환
		 */
		System.out.println("나눗셈(몫):"+(num1/num2));
		System.out.println("나눗셈(나머지):"+(num1%num2));
		
		// 곱셈과 나눗셈이 덧셈 뺄셈보다 우선순위가 ㄴㄹㄷ
		
		int result = 3*2 + 5 % 2 - 6 / 3 * 5;
		System.out.println("결과는?:"+result);
	}

}
