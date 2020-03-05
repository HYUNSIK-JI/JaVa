class SuperSubStatic{
	public static void main(String[] args){
		SuperCLS obj1=new SuperCLS();
		SuperCLS obj2=new SuperCLS();

		//아래 인스턴스 생성 과정에서 SuperCLS생성자 호출되므로,
		 SubCLS obj3=new SubCLS(); //count 값 1증가
		 obj3.showCount();
	}
}
class SuperCLS{
	protected static int count=0; //protected는 하위클래스 접근을허용
	
	public SuperCLS(){
		count++;
	}
}
class SubCLS extends SuperCLS{
	public void showCount(){
		//상위클래스에 위치한 클래스 변수 count에 접근
		System.out.println(count);
	}
}