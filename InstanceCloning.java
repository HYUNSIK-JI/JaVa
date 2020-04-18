class InstanceCloning{
	public static void main(String[] args){
		Point org=new Point(3,5);
		Point cpy;
	try{
		cpy=(Point)org.clone();
		org.showPosition();
		cpy.showPosition();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
			}
	}
}
class Point implements Cloneable{
	private int xpos;
	private int ypos;

	public Point(int x,int y){
		xpos=x;
		ypos=y;
	}
	public void showPosition(){
		System.out.printf("[%d %d]",xpos,ypos);
		System.out.println();
		}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
