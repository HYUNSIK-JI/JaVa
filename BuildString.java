class BuildString{
	public static void main(String[] args){
	//문자열 "123"이 저장된 인스턴스 생성
	StringBuilder stbuf=new StringBuilder("123");

	stbuf.append(45678);//문자열덧붙이기
	System.out.println(stbuf.toString());

	stbuf.delete(0,2);//문자열 일부삭제
	System.out.println(stbuf.toString());

	stbuf.replace(0,3,"AB"); //문자열 일부교체
	System.out.println(stbuf.toString());
	
	stbuf.reverse(); //문자열 내용뒤집기
	System.out.println(stbuf.toString());

	String sub=stbuf.substring(2,4);//일부만 문자열로 반환
	System.out.println(sub);
	}
}