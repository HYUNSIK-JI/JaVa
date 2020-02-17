class FirstStringIntro{
	public static void main(String[] args){
		//문자열 선언과 동시에 참조변수로 참조한다.
		String str1="Haapy";
		String str2="Birthday";
		System.out.println(str1+""+str2);

		//메소드에 문자열을 전달하는 다양한 방법을 보여준다.
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	//String 참조변수를 매개변수로 선언하여 문자열을 전달 받을수 있다.
	public static void printString(String str){
		System.out.print(str);
	}
}