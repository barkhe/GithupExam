package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
 * do~while문
 * 반드시 한 번은 실행해야 할 경우 사용하는 반복문으로 조건검사없이
 * 무조건 한 번은 실행된다
 * 형식 ]
 * 	반복을 위한 변수;
 * 	do{
 * 		실행문;
 * 		증감식;
 * 	} while(조건식); <- 문장의 끝에 세미콜론이 들어간다 
 */
public class E04DoWhile {

	public static void main(String[] args) throws IOException {

		/*
		 1~10까지 더하는 수열문제를 do~while문으로 변경
		 */
		// 누적합과 반복을 위한 변수 생성
		int sum = 0;
		int i = 1;
		// 조건검사없이 무조건 진입해서 실행
		do {
			// 증가하는 변수 i를 누적해서 sum에 더해준다
			sum += i;
			i++;
			// 탈출의 조건을 위해 증가시킨 후 확인한다
		} while(i<=10);
		System.out.println("1~10까지의 누적합:"+sum);
		
		/*
		 * 1부터 1000까지의 정수중 4의배수이거나 
		 * 7의 배수인 수의 합을 구하여 출력
		 */
		int total = 0;
		int j = 1;
		do {
			// 4 혹은 7의 배수인지 확인
			if(j%4==0 || j%7==0) {
				// 증가하는 j를 누적해서 더함
				total += j; 
			}
			j++;
		} while(j<=1000);
		System.out.println("1~1000까지의 4or7의 배수합:"+ total);
		
		
		/*
		 * 국어 영어 수학 점수를 입력받은 후
		 * 평균을 구해 학점 판단
		 * 사용자가 X,x 입력하면 프로그램 종료
		 */
		// 사용자로부터 점수를 입력받기 위해 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		// 점수와 탈출문자 입력을 위한 변수 선언
		int kor, eng, math, avg;
		int exitCode;
		do {
			// 조건 확인없이 진입하여 점수 입력받음
			System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.print("수학점수:");
			math = scanner.nextInt();
			
			/*
			 * 평균점수의 구간을 설정하기 위해 10으로 나누는 연산 추가
			 * switch문은 조건식 사용불가, 산술식만 가능
			 * 
			 */
			avg = (kor+eng+math) / (3*10);
			switch(avg) {
			case 10: case 9:
				System.out.println("A학점");break;
			 case 8:
					System.out.println("B학점");break;
			 case 7:
					System.out.println("C학점");break;
			 case 6:
					System.out.println("D학점");break;
			 default:
					System.out.println("F학점");
			}
			
			System.out.println("종료하려면 x(X)를 입력하세요");
			System.out.println("계속하려면 아무키나 입력하세요");
			exitCode = System.in.read();
		} while(!(exitCode=='x' || exitCode=='X'));
		/*
		 * x를 입력한 경우
		 * 	!(true || false) => !(true) => false
		 * 	따라서 while문 탈출
		 * a를 입력한 경우
		 *  !(false || false) => !(false) => true
		 *  반복문의 처음으로 돌아감
		 */
	}

}
