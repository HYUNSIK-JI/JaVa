class FirstStringIntro{
	public static void main(String[] args){
		//���ڿ� ����� ���ÿ� ���������� �����Ѵ�.
		String str1="Haapy";
		String str2="Birthday";
		System.out.println(str1+""+str2);

		//�޼ҵ忡 ���ڿ��� �����ϴ� �پ��� ����� �����ش�.
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	//String ���������� �Ű������� �����Ͽ� ���ڿ��� ���� ������ �ִ�.
	public static void printString(String str){
		System.out.print(str);
	}
}