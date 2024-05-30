package ex03operator;

public class E02BokhapOperator {

	public static void main(String[] args) {

		/*
		 복합대입연산자 : 산술연산자와 대입연산자를 연결해놓은 형태
		 좌우값을 연산하여 좌측의 변수에 대입하는 구조
		 문법구조상 항상 현재의 타입을 유지하는 특성
		 */
		double e = 3.1;
		e += 2.1; // 5.2
		e *= 2; // 10.4
		e += e; // 20.8
		// 변수 e에 값이 누적된다
		System.out.println("e의 결과값:" +e);
		
		int n =5;
		/*
		 정수와 실수를 연산하면 실수의 결과가 나오므로
		 n에 대입할 수 없어 에러 발생
		 */
//		n = n* 2.7;
		// 위를 정상적으로 처리하기위해 아래와 같이 강제형변형
		n = (int)(n*2.7);
		/*
		 복합대입연산자 사용 문법구조상 기존 자료형 그대로 유지
		 연산의 결과는 정수
		 */
		n *= 2.7;
		System.out.println("n의 결과값:"+n);
	}

}
