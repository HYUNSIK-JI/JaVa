class CompString{
	public static void main(String[] args){
		String st1="Lexicograhically";
		String st2="lexicograhically";
		int cmp;
		
		if(st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		cmp=st1.compareTo(st2);

		if(cmp==0)
			System.out.println("�� ���ڿ� ��ġ�մϴ�.");
		else if(cmp<0)
			System.out.println("������ �տ� ��ġ�ϴ¹���:."+st1);
		else
			System.out.println("������ �տ� ��ġ�ϴ¹���:."+st2);
	
		if(st1.compareToIgnoreCase(st2)==0)
			System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
}