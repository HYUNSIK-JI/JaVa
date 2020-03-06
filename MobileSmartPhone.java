class MobileSmartPhone{
	public static void main(String[] args){
		SmartPhone phone=new SmartPhone("010-555-7777","Nougat");
		phone.answer();//전화를받는다.
		phone.playApp();//앱을 선택하고 실행한다.
	}
}
class MobilePhone{
	protected String number;//전화번호

	public MobilePhone(String num){
		number=num;
	}
	public void answer(){
		System.out.println("Hi~From"+number);
	}
}
class SmartPhone extends MobilePhone{
	private String androidver;//안드로이드 운영체제 네임 버전

	public SmartPhone(String num,String ver){
		super(num);
		androidver=ver;
	}
	
	public void playApp(){
		System.out.println("App is running in "+androidver);
	}
}