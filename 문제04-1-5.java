class problem04_5{
	public static void main(String[] args) {
		int n1=(25+5)+(36/4)-72;
		int n2=(25*5)+(36-4)+71;
		int n3=(128/4)*2;
		boolean result;
		n1=n1*5;
		n2=n2/4;

		result=((n1>n2)&&(n1>n3)&&(n2>n3));
		System.out.println("result="+result);
	}
}