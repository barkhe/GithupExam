package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {

		/*
		 SCE(short - circue evaluation)
		 : 하나의 조건 검사로 결과를 알 수 있는 경우 
		 Java 컴파일러는 뒤 조건을 검사하지 않고 건너 뜀
		 변수의 값이 변경되는 코드 실행 x 니까 주의
		 */
		int num1=0,num2=0;
		boolean result;
		
		/*
		 논리And의 경우 둘 중 하나만 false 면 무조건 fasle 반환
		 첫번째 조건이 false면 두 번째 조건은 실행하지 않음
		 */
		result = (num1+=10)<0&&(num2+=10)>0;
		System.out.println("result="+result);
		//num2는 초기값인 0 유지
		System.out.println("num1="+num1+", num2="+num2);
		
		/*
		 논리 Or의 경우 둘중 하나만 true면 무조건 true반환
		 첫번째 조건에 true면 두번째 조건 검사 안 함
		 */
		result = (num1+=10)>0|| (num2+=10)>0;
		System.out.println("result=" + result);
		// num2는 초기값인 0 유지
		System.out.println("num1=" + num1 + ", num2=" + num2);
	}

}
