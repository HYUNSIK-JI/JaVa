class yummycakeSuper{
	public static void main(String[] args){
		Cheesecake cake=new Cheesecake();
		cake.yummy();
		cake.tasty();
	}
}
class cake{
	public void yummy(){
		System.out.println("yummy cake");
	}
}
class Cheesecake extends cake{
	public void yummy(){ 
		super.yummy(); //cake�� yummu�޼ҵ�ȣ��
		System.out.println("yummy cheese cake");
	}

	public void tasty(){
	super.yummy(); //cake�� yummy�޼ҵ�ȣ��
	System.out.println("Yummy Tasty Cake");
	}
}