class StringInst{
	public static void showString(String str){
		System.out.println(str);
		System.out.println("FUnny String일때만 적용"); //함수를 일으킬때만 사용됨.
		System.out.println(str.length());
		}
	
	public static void main(String[] args){
		String str1=new String("Simple String");
		String str2="The Best String";
		
		System.out.println(str1);
		System.out.println(str1.length());//length의 반환값을 인자로 전달
		System.out.println();//단순한 '개행'

		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();

		showString("Funny String");//string 인스턴스 생성후 메소드 호출
	}
}