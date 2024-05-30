package ex05method;

public class E08RecursiveError {

	public static void main(String[] args) {
		showHi(3);
		
	}
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt="+cnt);
		/*
		 * 해당 위치에서는 에러 발생
		 * if문 상단에서 재귀호출 되므로 if문 블럭 실행안 됨
		 * 따라서 if문 하단으로 호출문장 이동
		 */
//		showHi(--cnt);
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
	}
	/*
	 * StackOverflow : 스택오버플로우 스택은 함수가 종료되기 전까지의
	 * 	모든 정보를 저장하는 메모리, 무한한 공간이 아니므로
	 * 무한루프에 빠지면 저장능력 초과해서 해당 예외 발생
	 */

}
