package ex04controlstatement;

/*
 else 문에는 조건식이 들어가면 에러가 발생
 */
public class E01If03 {

	public static void main(String[] args) {
/*
 시나리오 ] 국영수 점수의 평균값을 구하여 학점을 출력하는
 	프로그램 작성. 90점 이상은 A학점...
 	60점 미만은 F학점을 출력
 */
		// 점수는 정수타입으로 할당
		int kor=99, eng=70, math=64;
		/* 평균값은 소수점이 나올 수 있으므로 실수형으로 선언
		 따라서 double의 결과를 얻기 위해 3.0으로 나눔 */
		double avg = (kor+eng+math) / 3.0;
		System.out.println("평균점수는(그대로):"+ avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n", avg);
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if (avg>=80) {
			System.out.println("B학점");
		}
		else if (avg>=70) {
			System.out.println("C학점");
		}
		else if (avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		
		System.out.println("잘못된 조건식의 if문");
		
		/*
		앞에서 작성한 if문에서 조건의 순서만 변경되었지만 
		60점 이상이라는 조건에 만족하기 때문에 높은 점수라도 모두 D학점 출력
		문법적인 오류는 없으나 논리적 오류가 발생
		 */
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if (avg>=70) {
			System.out.println("C학점");
		}
		else if (avg>=80) {
			System.out.println("D학점");
		}
		else if (avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		
		System.out.println("잘못된 조건식의 if문");
	}
	
	

}
