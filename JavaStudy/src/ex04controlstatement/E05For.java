package ex04controlstatement;

public class E05For {

	public static void main(String[] args) {

		/*
		 * for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간
		 * 메모리에서 소멸, 여기서 사용된 변수 j는 지역변수
		 * 지역변수는 해당 지역을 벗어나면 메모리에서 소멸
		 */
		// for문의 블럭을 벗어나면 변수 j는 소멸
		
		/*
		 * for문의 초기값을 외부(넓은지역, 여기서는 main메서드 지역)에서 선언하면
		 * 해당변수는 for문의 안쪽에서 사용할 수 있다
		 * 아래에 선언한 변수 i는 main 메서드의 지역변수로 선언된다
		 */
		int i=0;
		for ( ; i<=5; i++) {
			System.out.println("for문 안에서 i값="+ i);
		}
		System.out.println("for문 밖에서 i값="+i);
		
		/*
		 * java에서는 중괄호가 나오면 하나의 지역이라 생각
		 * 즉 if문 while문 등의 제어문도 하나의 지역을 형성
		 */
		
		/*
		 연습문제 1] 구구단을 출력하는 프로그램을 for문으로 작성
		  */
		
		//단에 해당하는 for문
		for (i=2; i<=9; i++) {
			// 수에 해당하는 for문
			for(int k = 1; k<=9; k++) {
				// 서식문자를 통해 칸을 미리 확보하여 정렬
				System.out.printf("%d*%d=%-3d", i,k,i*k);
				// 각 항목을 구분하기 위해 띄어쓰기 
				System.out.print(" ");
			}
			// 하나의 단을 모두 출력한 후 줄바꿈 처리
			System.out.println();
		}
	}
	

}
