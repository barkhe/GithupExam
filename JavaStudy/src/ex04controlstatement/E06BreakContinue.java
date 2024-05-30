package ex04controlstatement;

/*
 * break 반복문이나 switch문에서 주로 사용되며 블럭내에서 탈출할 때 사용
 * 만약 중첩된 반복문이라면 가장 가까운 블럭 하나만 탈출
 * continue 반복문의 처음으로 돌아감 while문의 경우 조건을 확인 후
 * for문의 경우 증감식이 실행 따라서 continue 아래 문장은 실행되지 않음
 */
public class E06BreakContinue {

	public static void main(String[] args) {

		int i = 0;
		// 무한루프 조건으로 while문 작성
		while(true) {
			/*
			 * 반복문 내에서 break, continue를 사용할 때는 
			 * 반드시 조건문과 같이 사용, 그렇지 않으면 해당 문장 하위는
			 * 실행되지 않는 쓰레기코드가 됨
			 */
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue 이전 출력문");
			// i가 짝수인 경우 반복문의 처음으로
			if(i%2==0) continue;
			System.out.println("continue 이후 출력문");
			
			System.out.println("break 이전 출력문");
			// i가 3일 때 반복문 탈출
			if(i==3) break;
			System.out.println("break 이후 출력문");
		}
		
		/*
		 * 중첩된 반복문 안에서 break를 만나면 "가장 가까운 반복문 하나"만 탈출
		 * 반복문 전체를 탈출하는 것이 아님
		 */
		for(int x =1; x<=5; x++) {
			System.out.println("x="+x);
			for (int y=1; y<=5; y++) {
				System.out.println("y="+y);
				if(y==3)
					break;
			}
		}
	}

}