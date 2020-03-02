class Supersubcon{
	public static void main(String[] args){
		new SubCLS();
	}
}
class SuperCLS{
	public SuperCLS(){ //持失切
		System.out.println("I'm Super Class");
	}
}
class SubCLS extends SuperCLS{
	public SubCLS(){  //持失切
		System.out.println("I'm Sub Class");
	}
}