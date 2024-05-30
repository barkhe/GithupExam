package ex01start;

// println() 내용을 출력한 후 자동으로 줄바꿈 처리
//print() 출력 후 줄바꿈 처리 x 필요 시 \n 추가
//printf() 출력내용을 서식에 맞춰 출력, 줄바꿈 x 필요 시 \n 또는 %n 추가
//			변수를 출력하는 서식문자에는 %d, %f 등이 있다
//			단 줄바꿈을 위한 %n은 printf()에서만 사용 가능



public class E02SystemOutPrintln {

	public static void main(String[] args) {

//		정수형 변수 선언 후 100으로 초기화
		int num1 = 100;

//		문자열과 정수형 변수를 + 기호를 통해 연결한 후 출력
		System.out.println("num1="+num1);
		System.out.print("num1="+num1 + "\n");
		System.out.printf("num1=%d%n", num1);
		
//		정수 실수를 단순히 출력
		System.out.println(7);
		System.out.println(3.14);
		
		/*
		 print()문에서의 +기호의 역할
		 1. 숫자(정수 혹은 실수)끼리는 실제 덧셈 연산
		 2. 문자열, 숫자 등 자료형이 다른 데이터끼리는 단순 연결
		 */
		
		System.out.println(3+5);//8
		System.out.println(3.5+5.1); //8.6
		
		/*
		 숫자와 문자열 혹은 문자열과 문자열은 단순 연결해서 출력
		 */
		System.out.println("3+5=" + 8);
		System.out.println(3.15+"는 실수입니다.");
		System.out.println("3+5"+" 의 연산결과는 8입니다.");
		
//		앞에서 정수형으로 선언한 변수를 이용해서 값을 출력
//		문자열 + 정수 + 문자열 연결해서 출력
		
		System.out.println("num1 은 " +num1+ " 입니다.");
	}

}
