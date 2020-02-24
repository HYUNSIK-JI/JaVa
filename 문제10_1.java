class Show{
	public static void main(String[] args){
		for(int i=0; i<10; i++)
			Accmulator.add(i);
		Accmulator.showResult();
	}
}
class Accmulator{
	static int total=0;

	static void add(int a){
		total+=a;
	}
	static void showResult(){
		System.out.println("sum="+total);
	}
}