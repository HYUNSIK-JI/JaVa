class BreakBasic{
	public static void main(String[] args){
		int num=1;
		boolean search=false;
		//ó�� ������ 5�ǹ������ 7�ǹ���μ��� ã�� �ݺ���
		while(num<100){
			if(((num%5)==0)&&((num%7)==0)){
				search=true;
				break;//while�� Ż��
			}
			num++;
		}
		
		if(search)
			System.out.println("ã������:"+num);
		else
			System.out.println("5�ǹ������ 7�ǹ���μ��� ã�� ���߽��ϴ�.");
	}
}