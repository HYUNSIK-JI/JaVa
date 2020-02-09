class BitOpMeans{

	public static void main(String[] args) {
		byte n1=13;
		byte n2=7;
		byte n3=(byte)(n1&n2);//&연산도 int형 연산을 하기때문에 형 변환을 하는것이다.
		System.out.println(n3);//피연산자는 byte형이지만 연산결과는 int형이다.
	}
}