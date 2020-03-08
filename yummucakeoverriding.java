class yummycakeoveriding{
	public static void main(String[] args){
		cake c1=new Cheesecake();
		Cheesecake c2=new Cheesecake();

		c1.yummy();//오버라이딩한 cheesecake의 yummy 메소드 호출됨
		c2.yummy();//오버라이딩한 cheesecake의 yummy 메소드 호출됨
	}
}
class cake{
	public void yummy(){
		System.out.println("yummy cake");
	}
}
class Cheesecake extends cake{
	public void yummy(){ //cake의 yummy메소드를 오버라이딩함
		System.out.println("yummy cheese cake");
	}
}