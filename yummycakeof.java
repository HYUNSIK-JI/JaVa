class yummycakeof{
	public static void main(String[] args){
		Cake cake=new strawberrycheesecake();
	if (cake instanceof Cake){
		System.out.println("���� �ν��Ͻ� or");
		System.out.println("���� ����ϴ� �ν��Ͻ�\n");
		}
	if (cake instanceof cheesecake){
		System.out.println("ġ������ �ν��Ͻ� or");
		System.out.println("ġ������ ����ϴ� �ν��Ͻ�\n");
		}
	if (cake instanceof strawberrycheesecake){
		System.out.println("����ġ������ �ν��Ͻ� or");
		System.out.println("����ġ������ ����ϴ� �ν��Ͻ�");
		}
	}
}
class Cake{
}
class cheesecake extends Cake{
}
class strawberrycheesecake extends cheesecake{
}