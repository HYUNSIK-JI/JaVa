import com.wxfx.smart.Circle;

class ImportCircle{
	public static void main(String[] args){
		Circle c1=new Circle(3.5);
		Circle c2=new Circle(5.5);
		
		System.out.println("반지름이 3.5인 원넓이:"+c1.getArea());
		System.out.println("반지름이 5.5인 원넓이:"+c2.getArea());
	}
}