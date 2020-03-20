class PrintableInterface{
	public static void main(String[] args){
		Printable prn=new Printer(); //printable�� �������� ������
		prn.print("Hello Java");
	}
}
interface Printable{
	public void print(String doc);
}
class Printer implements Printable{ //Printable�� �����ϴ� printerŬ����
	@Override
	public void print(String doc){ //�������̵� ���� ����
		System.out.println(doc);
	}
}