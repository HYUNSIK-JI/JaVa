class PrintableInterface{
	public static void main(String[] args){
		Printable prn=new Printer(); //printable형 참조변수 선언기능
		prn.print("Hello Java");
	}
}
interface Printable{
	public void print(String doc);
}
class Printer implements Printable{ //Printable을 구현하는 printer클래스
	@Override
	public void print(String doc){ //오버라이딩 관계 성립
		System.out.println(doc);
	}
}