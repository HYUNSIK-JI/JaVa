class ����05_6_2{
	public static void main(String[] args){
		int num=1;
		int total=0;

		while(true){
			if((num%2)!=0){
				total+=num;
				if(total>1000){
					System.out.println(num);//�� ���ڸ� ���ϸ� õ�� �ѱ��.
					System.out.println(total);//õ�� �Ѵ� ���� ������ �˷��ִ°��̴�.
					break;
				}
			}
			num++;
		}
	}
}