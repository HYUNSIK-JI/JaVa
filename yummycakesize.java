class yummycakesize{
	public static void main(String[] args){
		cheesecake ca1=new cheesecake(5,7);
		cake ca2=ca1;

		//ca2�� cake���̹Ƿ� ca2.size�� cake��
		//��� size�� �ǹ���

		System.out.println("Bread Ounces:"+ca2.size);
		
		//ca1�� cheesecake���̹Ƿ� ca1.size�� cheesecake�� ���
		//size�� �ǹ���

		System.out.println("Cheese Ounces:"+ca1.size);
		System.out.println();

		ca1.showcakesize();
		System.out.println();
		ca2.showcakesize();
	}
}
class cake{
	public int size; //cake size

	public cake(int sz){
		size=sz;
	}
	
	public void showcakesize(){
		System.out.println("bread ounces:"+size);
	}
}
class cheesecake extends cake{
	public int size; //cheese size


	public cheesecake(int sz1,int sz2){
		super(sz1);
		size=sz2;
	}
	public void showcakesize(){
		//super.size�� ����Ŭ������ ��� size���ǹ���
		System.out.println("Cheese Ounces:"+size);
	}
}