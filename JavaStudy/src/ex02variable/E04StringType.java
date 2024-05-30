package ex02variable;

public class E04StringType {

	public static void main(String[] args) {

		/*
		 String 클래스 : 참조형 변수로써 기본자료형이 아닌 클래스로 문자열
		 저장, 조작하는 기능
		 자바에서는 문자열 표현시 " 로 감쌈
		 연결 시에는 + 기호를 사용
		 */
		int number;
		number = 99;
		
		/*
		 클래스를 통해 생성한 참조형 변수와 기본자료형 사이에서는
		 형변환이 불가능
		 서로 사용하는 메모리 공간이 다르기 때문
		 기본자료형 : Stack(스택) 영역 사용
		 참조자료형(클래스) : Heap(힙) 영역 사용
		 */
//		아래 2개의 문장은 모두 에러 발생
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		// String + int => 단순 연결 출력
		String strNumber = "100";
		System.out.println(strNumber + number);
	
		// String은 클래스이므로  new를 사용해서 변수 생성 가능
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		// String 변수는 주로 더블쿼테이션(쌍따옴표) 통해 생성
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		// + 기호는 문자열 연결하는 기능으로 사용
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		 문자열 + 정수 : 우선순위가 없다면 일반적으로 문자열로 출력
		 단 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호로 묶어서
		 우선순위에 대한 변화를 줌
		 */
		int kor = 100, eng = 99, math =98;
		// 1009998 형태로 출력
		System.out.println("총점:" +kor+eng+math);
		// 덧셈된 결과로 297이 출력
		System.out.println("총점:"+(kor+eng+math));
	}

}
