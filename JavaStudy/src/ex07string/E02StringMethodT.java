package ex07string;

public class E02StringMethodT {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		String juminNum = "190419-5000000";
		String str2 = "190419-4000000";
		
		System.out.println("### 시나리오 1 ###");
	
		System.out.println(juminNum.charAt(7));
		char gender = juminNum.charAt(7);
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다");
		}
		else if(gender =='2' || gender=='4'){
			System.out.println("여자입니다.");
		}
		else if(gender=='5'||gender=='6') {
			System.out.println("외국인입니다.");
		}
		else
			System.out.println("주민번호를 잘못 입력하셨습니다");

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/

		System.out.println("### 시나리오2 ###");
		String email = "hong@daum.net";
		System.out.println("포함된 문자 확인하기=" + email.contains("@"));
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일형식임");
		}
		else {
			System.out.println("이메일 형식이 아님");
		}
		
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		
		System.out.println("### 3 ##");
		String jumin = "190419-2000000";
		System.out.println("하이픈 위치 찾기="+ jumin.indexOf("-"));
		int genderindex = jumin.indexOf("-")+1;
		if(jumin.charAt(genderindex)=='1' ||
				jumin.charAt(genderindex)=='3') {
			System.out.println("남자");
		}
		else if(jumin.charAt(genderindex)=='2' ||
				jumin.charAt(genderindex)=='4') {
			System.out.println("여자");
		}
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("### 시나리오4 ###");
		String filename = "my.file.images.jpg";
		
		int dotPoIdx = filename.lastIndexOf(".");
		// .의 위치 다음의 문자열부터 잘라내므로 +1해서 처리한다
		String fileExt = filename.substring(dotPoIdx+1);
		System.out.println("파일확장자="+fileExt);

	}

}
