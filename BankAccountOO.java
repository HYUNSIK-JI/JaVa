class BankAccountOO{
	public static void main(String[] args){
	//�ΰ��� �ν��Ͻ� ����
	BankAccount yoon=new BankAccount();
	BankAccount park=new BankAccount();

	//�� �ν��Ͻ��� ������� ������ ����
	yoon.deposit(5000);
	park.deposit(3000);

	//�� �ν��Ͻ��� ������� ����� ����
	yoon.withdraw(2000);
	park.withdraw(2000);

	//�� �ν��Ͻ��� ������� �ܾ��� ��ȸ
	yoon.checkmyBalance();
	park.checkmyBalance();
	}
}
class BankAccount{
	int balance=0;

	public int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public  int checkmyBalance() {
		System.out.println("�ܾ�:"+balance);
		return balance;
	}
}