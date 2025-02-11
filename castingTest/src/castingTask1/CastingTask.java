package castingTask1;
//넷플릭스
//애니메이션, 영화, 드라마
//사용자가 선택한 영상이
//각각 자식 클래스의 메서드
//애니메이션이라면 "자막 지원" 기능 사용 (출력)
//영화라면 "4D" 기능 사용 (출력)
//드라마라면 "굿즈" 기능 사용 (출력)
// 부모클래스는 타입을 주기 위한 용도, 기능은 없어도됌...

class Video {
	public Video() {;}
	
	void function() {
		
	}	
}

class Animation extends Video {
	public Animation() {;}
	
	@Override
	void function() {
		System.out.println("자막 지원");
	}
	
}

class Movie extends Video{
	public Movie() {;}
	
	@Override
	void function() {
		System.out.println("4D");
	}
}

class Drama extends Video{
	public Drama() {;}
	
	@Override
	void function() {
		System.out.println("굿즈");
	}
}


public class CastingTask {
	public static void main(String[] args) {
//		객체화
		Video video = new Video(); // 부모 클래스
		Video video1 = new Animation(); // 부모 클래스에 자식 들어감
		Video video2 = new Movie();
		Video video3 = new Drama();
		
//		Video video = new Animation();
		
		if(video instanceof Animation) { 
			Animation animation = (Animation)video;
			animation.function();
		}
		else if(video instanceof Movie) {
			Movie movie = (Movie)video;
		}
		else if(video instanceof Drama) {
			Drama drama = (Drama)video;
		}
		ct = new 
		ct.checkVideo(new Drama());
		
	}

	

	
	
	
	
}
