package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String str1 = "190419-3000000";
		String str2 = "190419-4000000";
		
		
		System.out.println(
				str1.charAt(7)== '3' ?
					"남자" : "여자");

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		System.out.println("### 시나리오2 ###");
		String email="hong@daum.net";
		System.out.println(email.contains(".net") ?
				"이메일형식임" : "이메일형식이아님");

		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	

		System.out.println("### 시나리오3 ###");
		String juminNum = "190419-2000000";
		
		System.out.println(juminNum.indexOf("-")+1);
		int num = juminNum.indexOf("-") +1;
		System.out.println(juminNum.charAt(num));
		char gender = juminNum.charAt(num);
		
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자입니다");
		}
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		System.out.println("### 4 ###");
		String file = "my.file.images.jpg";
		System.out.println(file.lastIndexOf("."));
		int num2 = file.lastIndexOf(".");
		System.out.println(file.substring(num2+1));

	}

}
