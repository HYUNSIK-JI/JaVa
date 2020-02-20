package Zoo;

public class Cat1{
	//public으로 선언된 메소드,따라서 어디서든 호출가능
	public void makesound(){System.out.println("야용");}
	
	//default를 public으로 전환
	//Dog.java패키지를 zoo로 변경
	//혹은 이문장을 주석처리
	//default로 선언된 메소드,따라서 동일 패키지로 묶인 클래스 내에서 호출가능
	public void makehappy(){System.out.println("스마일");}
}