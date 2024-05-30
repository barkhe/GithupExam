package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {

		/*
		 자동형변환 : 작은 자료형의 데이터를 큰 자료형에 대입할 때
		 자동으로 형변환 발생
		 */
		byte b1 = 65;
		short s1;
		// byte가 short보다 작은 자료형이므로 자동형변환
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		/*
		 아래 코드는 자동형변환 X
		 CPU는 int 보다 작은 자료형 연산 시 int로 간주하여 진행, 결과도 int
		 int에 최적화된 CPU의 특성
		 */
		int num1 = b1 + s1;
		System.out.println("num1= "+num1);
		
		/*
		 char(문자타입)에 byte 바로 대입 불가능
		 특성이 다름, 강제형변환 후 대입
		 */
//		char ch1 = b1;
		char ch2 = (char)b1;
		System.out.println("b1="+b1+", ch2="+ch2);
		
		/*
		 명시적 형변환 : 큰 상자의 자료를 적은 상자의 자료형에 할당해야 할 때 
		 사용, 단 자료의 손실 가능성, 필요한 경우에만 사용
		 
		 */
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n", b2,s2);
		
		/*
		 소수점 아래부분이 버려지므로 데이터 손실이 있는 경우
		 흔이 원단위절삭과 ㄱ
		 */
		int num3;
		double d1 = 3.14;
		num3 = (int)d1;
		System.out.printf("데이터손실:num3=%d, d1=%.2f \n", num3,d1);
		
		char ch3 = 'A', ch4;
		int num4 = 2;
//		ch4 = ch3 + num4;
		ch4 = (char)(ch3+num4);
		System.out.println("ch4="+ch4);
	}

}
