package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		/*
		 정수자료형
		 byte, short, int, long 타입
		 
		 일반적으로 CPU는 정수형 연산을 할 때 int형을 가장 빠르게 처리
		 - 정수형 변수 사용할 때 거의 대부분 int형 사용
		 
		 */
//		int형 변수 선언 후 초기값 할당
		int int1 = 100;
		int int2 = 200;
//		300의 결과값이 변수에 할당
		int result1 = int1 + int2;
//		int형끼리의 연산은 int형의 결과가 반환
		System.out.println("int1 + int2 = " + result1);
		
//		100/200의 결과는 0
//		자바에서는 정수와 정수의 연산결과 정수 반환
//		실수의 결과 반환받고 싶을 시 형변환 해야 함
		
		result1 = int1 / int2;
		System.out.println("int1 / int2 = " +result1);
		
//		동일한 타입의 변수를 2개 이상 선언할 때는 콤마 사용
//		int형보다 작은 자료형 연산시 cpu는 int형으로 변환하여 계산
//		cpu는 정수 연산 경우 int형에 최적화
//		byte, short형은 게임캐릭터 움직임이나 음원파일 등에 사용
		
	
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = "+ result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 = "+ result3);
		
//		동일 자료형끼리의 연산은 동일자료형 되는 것이 기본원칙
//		큰 자료형과 작은 자료형 연산 시 큰 자료형으로 자동변환
//		데이터의 손실(오차) 방지
		
		
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = "+ result4);
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 = "+result4 );
		
//		자바 컴파일러는 정수형 상수를 기본적으로 int형으로 간주하기 때문에
//		아래 정수를 메모리에 로드 시 에러 발생
//		이때 접미사 (L 혹은 l) 붙여서 long형의 자료임을 컴파일러에게 알려줌
//		할당을 위해 입력되는 숫자로 자료형을 기본으로 메모리에 로드, 이를 가리켜 리터얼이라고 함ㅁ
//		long long3 = 2200000000; //에러발생
		long long4 = 2200000000L;
		long long5 = 2200000000l;
		
		System.out.println("long4=" + long4);

		
	}

}
