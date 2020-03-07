class MobileSmartPhone{
	public static void main(String[] args){
		SmartPhone ph1=new SmartPhone("010-555-7777","Nougat");
		MobilePhone ph2=new SmartPhone("010-999-3333","Nougat");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();

		ph2.answer();
		//ph2.playApp();
	}
}
class MobilePhone{
	protected String number;//��ȭ��ȣ

	public MobilePhone(String num){
		number=num;
	}
	public void answer(){
		System.out.println(" Hi~From "+number);
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