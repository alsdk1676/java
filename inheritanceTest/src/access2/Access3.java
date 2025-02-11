package access2;

import access1.Access1;

public class Access3 extends Access1{
	public static void main(String[] args) {
		Access3 access3 = new Access3();
		access3.data3; // 패키지가 다르지만 상속받은 자식이기 때문에 접근 가능
		
	}

}
