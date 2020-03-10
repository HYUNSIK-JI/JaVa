class yummycakesize{
	public static void main(String[] args){
		cheesecake ca1=new cheesecake(5,7);
		cake ca2=ca1;

		//ca2는 cake형이므로 ca2.size는 cake의
		//멤버 size를 의미함

		System.out.println("Bread Ounces:"+ca2.size);
		
		//ca1은 cheesecake형이므로 ca1.size는 cheesecake의 멤버
		//size를 의미함

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
		//super.size는 상위클래스의 멤버 size를의미함
		System.out.println("Cheese Ounces:"+size);
	}
}