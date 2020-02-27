class ArrayIsInstance2{
	public static void main(String[] args){
		Box[] ar=new Box[5]; //길이가 5인 Box형 1차원 배열의생성
		System.out.println("length:"+ar.length); //length : 5
	}
}
class Box{
	private String conts;

	Box(String cont){
		this.conts=cont;
	}
	public String toString(){
		return conts;
	}
}