package ex06array;

import java.util.Random;

public class E01OneDimArray02 {

	public static void main(String[] args) {

		/*
		 * 난수생성방법1
		 * Math클래스의 random() 메서드는 0~1사이의 실수를
		 * 랜덤하게 반환해 줌, 정수 형태의 난수가 필요하다면 10이나 100과 같은 정수
		 * 곱한 후 필요한 데이터 만들어 줌
		 */
		double rndNumber = Math.random();
		System.out.println("생성된 난수[실수]:" + rndNumber);
//		정수와 실수를 연산하면 실수가 반환되므로 int로 강제형변환
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된 난수[정수]:"+ intNumber);
		
		/*
		 * 난수생성방법2
		 * Random 클래스 사용
		 * 사용법 Scanner와 동일하게 정수형 난수 생성하고 싶다면 nextInt()사용
		 */
		Random random = new Random();
		System.out.println("생성된 난수:" + random.nextInt());
		System.out.println("============================");
		
		/*
		 * 로또번호처럼 1~45사이의 난수를 생성하는 방법
		 * 0.xxx 형태의 난수 생성후 정수 변경하기 위해 100을 곱함
		 * 45로 %연산하여 나머지 구함
		 * 정수를 45로 나누면 나머지는 0~44 사이가 됨
		 * 0은 구간에 포함되지 않으므로 결과에 1 더해줌
		 * 정수의 결과가 필요하므로 int로 강제 형변환
		 */
		
		System.out.println("1~45사이의 난수생성:"+
					((int)((Math.random()*100) % 45)+1));
		System.out.println("===========================");
		
		/*
		 * 크기가 6인 배열 생성해서 난수 저장한 후 출력
		 * 중복 난수 생성될 수 있고 정렬 또한 되지 않음 (이 부분은 컬렉션에서 다룸)
		 */
		System.out.println("크기가 6인 배열에 난수 입력");
		// 크기가 6인 배열 생성
		int[] lottoNum = new int[6];
		// 난수 생성후 배열에 순서대로 입력
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45)+1;
		}
		// 순서대로 출력
		for(int i=0; i<lottoNum.length; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
		
	}

}
