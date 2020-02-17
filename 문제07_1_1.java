class UseTriangle{
	public static void main(String[] args){
		Triangle tr=new Triangle(10.2,17.3);
		System.out.println("»ï°¢ÇüÀÇ³ÐÀÌ:"+tr.get_area());
		
		tr.setbottom(7.9);
		tr.setheight(15);
		System.out.println("»ï°¢ÇüÀÇ³ÐÀÌ:"+tr.get_area());
	}
}
class Triangle{
	double bottom;
	double height;

	public Triangle(double bt,double ht){
		bottom=bt;
		height=ht;
	}
	
	public void setbottom(double bt){
		bottom=bt;
	}
	public void setheight(double ht){
		height=ht;
	}
	public double get_area(){
		return bottom*height/2;
	}
}