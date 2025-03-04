package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
//		기본적으로 false
//		회원가입
//		if(memberDAO.checkId("sma12345")) {
//			System.out.println("사용 가능한 아이디");
//			memberVO.setMemberId("sma12345");
//			memberVO.setMemberPassword("1234");
//			memberVO.setMemberName("서민아");
//			memberVO.setMemberAddress("서울시 영등포구");
//			
//			memberDAO.join(memberVO); // 컨트롤러를 통해 화면에서 버튼 눌렀을 떄 실행될 메소드
//		} else {
//			System.out.println("중복된 아이디");
//		}
		
		memberVO.setMemberId("sma12345");
		memberVO.setMemberPassword("1234");
		memberVO.setMemberId("sma12345");
		memberVO.setMemberPassword("1234");
		
//		System.out.println(memberVO);
		
//		로그인
		if(memberDAO.login(memberVO)) {
//			System.out.println(memberDAO.session);
			System.out.println("로그인 성공");
		} else {
//			System.out.println(memberDAO.session);
			System.out.println("로그인 실패");
		}
		
		
//		정보 수정
//		MemberVO updatedMember = new MemberVO();
//		updatedMember.setMemberId("hgd12345");
//		updatedMember.setMemberPassword("12345");
//		updatedMember.setMemberName("홍길동");
//		updatedMember.setMemberAddress("서울시 강남구");
//		  
//		memberDAO.update(updatedMember);
//		System.out.println("수정 완료");
//		
//	}
	
//	비밀번호 수정
	MemberVO updatedPassword = new MemberVO();
	updatedPassword.setMemberPassword("123456");
	
	memberDAO.updatePassword(updatedPassword);
	System.out.println("비밀번호 수정 완료");
	
	}
	
	

}
