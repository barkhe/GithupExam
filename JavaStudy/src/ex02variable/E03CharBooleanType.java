package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {

		/*
		 char형: 하나의 문자를 저장할 수 있는 자료형으로 값을 저장할 때
		 홑따옴표로 감싸서 표현
		 만약 쌍따옴표로 감싸면 문자열로 인식하므로 String으로 선언
		 */
		char ch1 = '가';
//		문자열이므로 char로 선언 X
//		char chStr = '가나다라';
//		따라서 String으로 선언해야 한다
		String chStr = "가나다라";
		System.out.println("ch1="+ch1);
		System.out.println("chStr="+chStr);
		
		
		/*
		 아스키코드 : 1byte로 표현할 수 있는 문자로 영문, 숫자를 십진수로 정의한 것
		 A => 65, a => 97
		 영어 대문자 소문자 32 차이
		 유니코드 : 1byte로 표현할 수 없는 문자로 영문과 숫자를 제외한 모든 문자 (한글, 한자 등)
		 2byte로 표현 보통 숫자가 크기 때문에 
		 16진수로 표현
		 */
		// 메모리에 65로 저장
		char ch2 = 'A';
		// 정수형 변수를 선언 및 초기화
		int num1 = 2;
		// 문자+정수 = 아스키코드로 저장되므로 연산 가능
		int num2 = ch2 + num1;
//		정수로 출력하면 67
		System.out.println("num2="+num2);
//		문자로 출력하면 C
		System.out.println("(char)num2= "+(char)num2);
		
//		(char)(char+int => int) => char형으로 강제 형변환
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=>" +ch3);
		System.out.println("ch3(아스키코드출력)=>" + (int)ch3);
		
//		싱글쿼테이션으로 감쌌으므로 문자1(아스키코드49)이 할당
		char ch4 = '1';
//		연산결과 50 이에 해당하는 문자 '2' 
		char ch4_1 = '1' +1;
//		문자 '2'와 정수 50 출력
		System.out.println("ch4="+ch4+", ch4_1="+ch4_1 +",ch4_1="+(int)ch4_1);
		
		
		/*
		 boolean 타입 : true 혹은 false 두 가지의 값만 가질 수 있는 자료형
		 산술연산(+,-), 비교연산(<,>=)에 사용할 수 없음
		 논리연산에만 사용 가능
		 */
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1="+bn1+",bn2="+bn2);
		
		/*
		 &&(논리And) : 엠퍼센트를 사용, 양쪽 모두 참일 때 true 반환
		  			그 외에는 모두 false 반환
		 ||(논리Or) : 파이프 사용, 둘 중 하나만 참이어도 true 반환
		 			둘 다 거짓일 때 false 반환
		 */
		// T && F -> False반환
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And)="+bn3);

		// T || F -> True 반환
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or)="+bn3);
		
		//문자 '가' 유니코드 44032
		bn3 = '가' > 30000;
		System.out.println("bn3="+bn3);
				
	}

}
