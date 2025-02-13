package chatting;

public class BadWordException extends RuntimeException{ // 오류를 발생시킬수 있는 객체
	
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
