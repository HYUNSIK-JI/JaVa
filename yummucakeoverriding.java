class yummycakeoveriding{
	public static void main(String[] args){
		cake c1=new Cheesecake();
		Cheesecake c2=new Cheesecake();

		c1.yummy();//�������̵��� cheesecake�� yummy �޼ҵ� ȣ���
		c2.yummy();//�������̵��� cheesecake�� yummy �޼ҵ� ȣ���
	}
}
class cake{
	public void yummy(){
		System.out.println("yummy cake");
	}
}
class Cheesecake extends cake{
	public void yummy(){ //cake�� yummy�޼ҵ带 �������̵���
		System.out.println("yummy cheese cake");
	}
}