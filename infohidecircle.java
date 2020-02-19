class InfoHideCircle{
	public static void main(String args[]){
		Circle c=new Circle(1.5);
		System.out.println("반지름:"+c.getrad());
		System.out.println("넓이:"+c.getArea()+"\n");
	
		c.setRad(3.4);
		System.out.println("반지름:"+c.getrad());
		System.out.println("넓이:"+c.getArea()+"\n");	
	}
}
class Circle{
	private double rad=0;//원의반지름
	final double PI=3.14;

	public Circle(double r){
		setRad(r);
	}
	public void setRad(double r){
		if(r<0){
		rad=0;
		return;
		}
		rad=r;
	}
	public double getrad(){
		return rad;
	}
	public double getArea(){
		return (rad*rad)*PI;//원의넓이 반환
		}
}