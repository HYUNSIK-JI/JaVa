package Zoo;

//Duck은 default로 선언되었으므로 동일 패키지내에서만 인스턴스 생성가능
class Duck{
	//빈클래스
}
//Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성가능.
public class Cat{
	public void makeCat(){
	//Duck과 같은패키지로 묶여있으니 DUCK인스턴스 생성가능
	Duck quack=new Duck();
	}
}