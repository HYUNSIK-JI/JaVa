class BadEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
	//Äà¹° Ä¸½¶ ±¸¸ÅÈÄ º¹¿ë
	suf.takeSinivelCap(new SinivelCap());

	//ÀçÃ¤±â Ä¸½¶ ±¸¸ÅÈÄ º¹¿ë
	suf.takeSneezeCap(new SneezeCap());

	//ÄÚ¸·Èû Ä¸½¶ ±¸¸ÅÈÄ º¹¿ë
	suf.takeSnuffleCap(new SnuffleCap());
	}
}
class SinivelCap{
	void take(){
		System.out.println("Äà¹°ÀÌ ½Ï~³³´Ï´Ù.");
	}
}
class SneezeCap{
	void take(){
		System.out.println("ÀçÄ¡±â°¡ ¸Ü½À´Ï´Ù.");
	}
}
class SnuffleCap{
	void take(){
		System.out.println("ÄÚ°¡ »½ ¶Õ¸³´Ï´Ù.");
	}
}
class ColdPatient{
	void takeSinivelCap(SinivelCap cap){
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap){
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap){
		cap.take();
	}
} 