class SuperSubStatic{
	public static void main(String[] args){
		SuperCLS obj1=new SuperCLS();
		SuperCLS obj2=new SuperCLS();

		//�Ʒ� �ν��Ͻ� ���� �������� SuperCLS������ ȣ��ǹǷ�,
		 SubCLS obj3=new SubCLS(); //count �� 1����
		 obj3.showCount();
	}
}
class SuperCLS{
	protected static int count=0; //protected�� ����Ŭ���� ���������
	
	public SuperCLS(){
		count++;
	}
}
class SubCLS extends SuperCLS{
	public void showCount(){
		//����Ŭ������ ��ġ�� Ŭ���� ���� count�� ����
		System.out.println(count);
	}
}