package animal;

public class Dog{
	public void makeCat(){
	// Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
	Zoo.Cat yaong=new Zoo.Cat();
	}

	public void makeDuck(){
		//Duck은 default로 선언되었으므로 이 위치에서 인스턴스 생성가능
		//zoo.Duck quack=new zoo.Duck();//컴파일 오류발생문장
		}
}