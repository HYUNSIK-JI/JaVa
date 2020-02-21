class oneclassEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
		suf.takesinus(new sinuscap());
	}
}
class sinuscap{
	void sniTake(){
		System.out.println("Äà¹°ÀÌ ½Ï~³³´Ï´Ù.");
	}
	void sneTake(){
		System.out.println("ÀçÄ¡±â°¡ ¸Ü½À´Ï´Ù.");
	}
	void snuTake(){
		System.out.println("ÄÚ°¡ »½ ¶Õ¸³´Ï´Ù.");
	}

	void take(){
		sniTake();
		sneTake();
		snuTake();
	}
}
class ColdPatient{
	void takesinus(sinuscap cap){
	cap.take();
	}
} 