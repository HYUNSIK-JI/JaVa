class ����05_4_3{
	public static void main(String[] args){
		int num=1;
		int total=0;

		while(num<=1000){
			if(num%2==0 && num%7==0){
				total+=num; //14�ǹ�� ��
			}
			num++;
		}
		System.out.println("����:"+total);
	}
}