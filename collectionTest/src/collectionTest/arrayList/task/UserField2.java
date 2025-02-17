package collectionTest.arrayList.task;

import java.util.ArrayList;

public class UserField2 {
    // DBConnecter로부터 가져온 User 목록을 저장하는 ArrayList
    public ArrayList<User> users = DBConnecter.users; 
    public static String userId; // 로그인한 사용자의 ID를 저장 (세션처럼 사용)
    final String SALT = "company"; // 암호화에 사용되는 고정 문자열
    final int KEY = 300; // 암호화에 사용되는 상수 값

    // 아이디 검사: 주어진 ID가 이미 존재하는지 확인
    public User checkId(String id) {
        for(User user : users) { // users 리스트를 반복하며
            if(user.getId().equals(id)) { // 주어진 ID와 일치하는 User 찾기
                return user; // 일치하는 사용자가 있으면 해당 user 반환
            }
        }
        return null; // 일치하는 사용자가 없으면 null 반환
    }

    // 회원가입: 주어진 User 객체로 회원가입을 처리
    public void join(User user) {
        User userInDB = checkId(user.getId()); // 아이디 검사
        if(userInDB == null) { // ID가 이미 존재하지 않으면
            users.add(user); // users 리스트에 해당 User 추가
        }        
    }

    // 로그인: 주어진 User 객체로 로그인 처리를 수행
//    public boolean login(User user) {
//        for(User userInDB : users) { // users 리스트를 반복하며
//            if(userInDB.getId().equals(user.getId())) { // 주어진 ID와 일치하는 User 찾기
//                if(userInDB.getPassword().equals(user.getPassword())) { // 비밀번호가 일치하면 로그인 성공
//                    return true; // 로그인 성공
//                }
//            }
//        }
//        return false; // 로그인 실패
//    }

    // 로그인 로직: 개선된 로그인 로직 (아이디 존재 여부 확인 후 비밀번호 확인)
    public boolean login(User user) {
        User userInDB = checkId(user.getId()); // 아이디 검사
        if(userInDB != null) { // ID가 존재하면
            if(userInDB.getPassword().equals(user.getPassword())) { // 비밀번호가 일치하면
                userId = user.getId(); // 세션처럼 로그인한 사용자 ID 저장
                return true; // 로그인 성공
            }
        }
        return false; // 로그인 실패
    }

    // 로그아웃: 로그인된 사용자 ID를 null로 초기화
    public void logout() {
        userId = null; // 로그아웃 시, userId를 null로 설정
    }

    // 암호화: 비밀번호를 암호화하여 반환
    public String encrypt(String password) {
        String encryptPassword = SALT + password; // SALT와 비밀번호 결합
        String encryptedPassword = "";
        for(int i = 0; i < encryptPassword.length(); i++) { // 문자열 길이만큼 반복
            encryptedPassword += (char)(encryptPassword.charAt(i) * KEY); // 각 문자를 KEY값과 곱하여 암호화
        }
        return encryptedPassword; // 암호화된 비밀번호 반환
    }

    // main 메서드: 암호화 테스트용 (실행 시 비밀번호 암호화 결과 출력)
    public static void main(String[] args) {
        UserField2 uf = new UserField2(); // UserField 객체 생성
        System.out.println(uf.encrypt("abcdefg")); // "abcdefg" 비밀번호 암호화 출력
    }
}
