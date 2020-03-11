class yummycakeof{
	public static void main(String[] args){
		Cake cake=new strawberrycheesecake();
	if (cake instanceof Cake){
		System.out.println("케익 인스턴스 or");
		System.out.println("케익 상속하는 인스턴스\n");
		}
	if (cake instanceof cheesecake){
		System.out.println("치즈케익 인스턴스 or");
		System.out.println("치즈케익 상속하는 인스턴스\n");
		}
	if (cake instanceof strawberrycheesecake){
		System.out.println("딸기치즈케익 인스턴스 or");
		System.out.println("딸기치즈케익 상속하는 인스턴스");
		}
	}
}
class Cake{
}
class cheesecake extends Cake{
}
class strawberrycheesecake extends cheesecake{
}