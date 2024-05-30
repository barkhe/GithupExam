package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {
		/*
		 * 배열을 선언과 동시에 초기화, 초기값의 개수를 통해 크기가 결정
		 * 생성된 배열 인스턴스의 주소값을 int형 배열변수인 arr에 할당
		 */
		int[] arr = {1,2,3,4,5};
		//배열변수만 선언하고 아직은 참조할 인스턴스 없는 상태
		int[] ref;
		System.out.println("초기화 직후 출력");
		// 초기값 그대로인 1~5까지 출력된다
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		/*
		 * 배열명을 출력하면 메모리의 주소값이 문자열형태로 출력
		 * 배열에 저장된 값 자체가 아닌 Heap영역에 생성된 메모리의 주소값을
		 * 저장하게 됨
		 */
		System.out.println("arr변수:" +arr);
		
		/* arr은 참조값이고, 7은 기본자료형은 int이므로 값 자체가 전달
		 * 메서드에서 반환한 참조값을 ref로 할당되므로 결국 같은 배열을 참조
		 */
		ref = addAllArray(arr, 7);
		
		/*
		 * main에서 생성했던 배열객체의 참조값을 매개변수로 넘기고
		 * 다시 반환 받았으므로 결국 동일한 배열 참조하게 되어
		 * 아래 출력문에서 동일한 결과가 2번 출력됨
		 */
		System.out.println("메소드 호출후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+ " ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	/*
	 * 매개변수로 전달된 배열의 참조값을 ar로 받게 되므로 해당 메서드에서도
	 * 동일한 배열을 참조할 수 있게 된다. 즉 main메서드에서 생성한 배열과
	 * 동일한 배열을 참조하게 된다
	 */
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i< ar.length; i++) {
			ar[i] += addVal;
		}
		return ar;
	}

}
