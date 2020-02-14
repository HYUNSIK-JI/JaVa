class Method2Pram{
	public static void main(String[] args){
		double myHeight=175.9;
		hieveryone(12,12.5);//12인자와 12.5의 전달
		hieveryone(13,myHeight);//인자13과 myheight에 저장된값 전달
		byeveryone(); //전달하는 인자없음
	}
	public static void hieveryone(int age,double height){
		System.out.println("제 나이는 "+age+"세입니다.");
		System.out.println("저의 키는 "+height+"cm입니다.");
	}
	
	public static void byeveryone(){
		System.out.println("다음에 뵙겠습니다.");
	}
}