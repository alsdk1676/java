package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import javax.management.RuntimeErrorException;

public class OptionalTest {
	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("서민아", "sma", "1234"),
			new User2("홍길동", "hgd", "2345"),
			new User2("장보고", "jbg", "7890"),
			new User2("이순신", "lss", "4567")
			));
	
//	public User2 findById(Long id) {
		public Optional<User2> findById(Long id) {
		User2 user = null;
		for(User2 userInDB : users) {
			if(userInDB.getId() == id) {
				user = userInDB;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
//		OptionalTest ot = new OptionalTest();
////		Long num1 = 0L;
////		long num2 = 3;
//		
////		User2 user = ot.findById(200L); // findById에 User가 들어가야되기 때문에
//		Optional<User2> user = ot.findById(200L);
////		System.out.println(user.toString());
//		
////		orElse : null이 아니라면 user, null이라면 대체 user
//		user.orElse(new User2());
//		
////		orElseThrow : null 아니라면 users, null이라면 () -> {예외 발생};
//		user.orElseThrow(() -> {
//			throw new NoSerachUserException("그런 회원 없습니다.");
//		});
		
//
////		ot.fildBuOd(5L).map(User2::getUserId).
//		user.ifPresent((findUser) -> {
//			System.out.println("ifPresent");
//			System.out.println(findUser.toString());
//		});
//		
////		null이 아닐 때만 실행하는 로직, user가 있을 떄마만 여거 로직을 실행해!
//		
//		user.ifPresent();
//		System.out.println(user.isPresent());
//		
//		
//		
//		
//		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
