class PrinterDriver3{
	public static void main(String[] args){
		String myDoc="This is a report about...";

		ColorPrintable prn=new Prn909Drv();

		prn.print(myDoc);

		System.out.println();

		prn.printCMYK(myDoc);
	}
}
interface Printable{
	void print(String doc);
}
interface ColorPrintable extends Printable{ //Printable를 상속하는 인터페이스
	void printCMYK(String doc);
}

//S사의 컬러프린트드라이버
class Prn909Drv implements ColorPrintable{
	@Override

	public void print(String doc){ //흑백
		System.out.println("From MD-909 black&white ver");
		System.out.println(doc);
	}

	@Override

	public void printCMYK(String doc){ //컬러
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
}