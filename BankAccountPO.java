class BankAccountPO{
	static int balance=0;//�����ܾ�
	public static void main(String[] args){
		deposit(10000);//�Ա�
		checkmyBalance();//�ܾ�Ȯ��
		withdraw(3000);//���
		checkmyBalance();//�ܾ�Ȯ��
	}
	
	public static int deposit(int amount) { //�Ա� ����ϴ� �޼ҵ�
		balance+=amount;
		return balance;
	}
	public static int withdraw(int amount) { //��� ����ϴ� �޼ҵ�
		balance-=amount;
		return balance;
	}
	public static int checkmyBalance() { //���� ��ȸ�� ����ϴ� �޼ҵ�
		System.out.println("�ܾ�:"+balance);
		return balance;
	}
}