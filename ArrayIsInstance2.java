class ArrayIsInstance2{
	public static void main(String[] args){
		Box[] ar=new Box[5]; //���̰� 5�� Box�� 1���� �迭�ǻ���
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