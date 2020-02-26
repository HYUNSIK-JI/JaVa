class RemoveBar2{
  public static void main(String[] args){
	StringBuilder stb=new StringBuilder("990929-1012999");
	stb.replace(6,7," ");
	System.out.println(stb.toString());
	}
}