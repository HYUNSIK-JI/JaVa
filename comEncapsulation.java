class comEncapsulation{
	public static void main(String args[]){
		ColdPatient suf=new ColdPatient();
		suf.takesinus(new sinuscap());
	}
}
class sinivelcap{
	void take(){
		System.out.println("Äà¹°ÀÌ ½Ï~³³´Ï´Ù.");
	}
}
class sneezecap{
	void take(){
		System.out.println("ÀçÄ¡°¡ ¸Ü½À´Ï´Ù.");
	}
}
class snufflecap{
	void take(){
		System.out.println("ÄÚ°¡ »½¶Õ¸³´Ï´Ù.");
	}
}
class sinuscap{
	sinivelcap sicap=new sinivelcap();
	sneezecap szcap=new sneezecap();
	snufflecap sfcap=new snufflecap();

	void take(){
		sicap.take(); szcap.take(); sfcap.take();
	}
}
class ColdPatient{
	void takesinus(sinuscap cap){
	cap.take();
	}
} 