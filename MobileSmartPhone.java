class MobileSmartPhone{
	public static void main(String[] args){
		SmartPhone phone=new SmartPhone("010-555-7777","Nougat");
		phone.answer();//��ȭ���޴´�.
		phone.playApp();//���� �����ϰ� �����Ѵ�.
	}
}
class MobilePhone{
	protected String number;//��ȭ��ȣ

	public MobilePhone(String num){
		number=num;
	}
	public void answer(){
		System.out.println("Hi~From"+number);
	}
}
class SmartPhone extends MobilePhone{
	private String androidver;//�ȵ���̵� �ü�� ���� ����

	public SmartPhone(String num,String ver){
		super(num);
		androidver=ver;
	}
	
	public void playApp(){
		System.out.println("App is running in "+androidver);
	}
}