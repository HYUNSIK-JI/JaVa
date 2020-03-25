class SimplePrinter{
	public static void main(String[] args){
		String myDoc="This is a report about...";
		Printable prn=new Printer();
		prn.print(myDoc);

		//�������̽��� static �޼ҵ� ����ȣ��
		Printable.printLine("end of line");
	}
}
interface Printable{
	static void printLine(String str){
		System.out.println(str);
	}
	default void print(String doc){
		printLine(doc);
	}
}
//�������̽� Printable���� �����ؾ� �� �޼ҵ尡 ���������ʴ´�.
class Printer implements Printable{}