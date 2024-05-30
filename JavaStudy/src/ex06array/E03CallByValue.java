package ex06array;

/*
 * Call by value(값에 의한 호출)
 * 메서드 호출과 관련된 개념으로 매개변수를 통해 값을 전달할 때 메모리의
 * '복사'를 통해 값이 전달됨
 * 그래서 다른 지역의 메서드에서 값의 변경이 있더라도 호출한 메서드의 값에는
 * 전혀 영향 미치지 않음
 * 메모리적 관점에서 보면 스택영역만 사용하는 케이스로 main과 호출된 메서드는
 * 서로 다른 지역이므로 서로에게 전혀 영향을 미치지 않는 것이 특징
 */
public class E03CallByValue {

	public static void main(String[] args) {
		// main 지역에서 최초로 변수 생성
		int first=100, second=200;
		
		System.out.println("[main메소드안-호출전]"+
				"first="+first+", second="+second);
		// 메서드 호출시 인수로 값 전달
		callByValue(first, second);
		
		System.out.println("[main메소드안-호출후]"+
				"first="+first+", second="+second);	
	}
	
	/*
	 * 매개변수로전달된 값은 복사되어 해당 지역의 메서드에서 사용할 수 있게 된다
	 * 매개변수의 전달은 메모리의 복사에 의해 이뤄진다
	 */
	public static void callByValue(int fNum, int sNum) {
		/*
		 * Swap(교환) : 두 개의 변수가 할당받은 값을 서로 교환하는 알고리즘을 말함
		 * 교환시에는 임시변수(temp)가 하나 추가로 필요하다
		 */
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("[callBaValue메소드안]"
				+"frist="+fNum+",second="+sNum);
	}
}
