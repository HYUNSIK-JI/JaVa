class BankAccountUniID{
	public static void main(String[] args){
		BankAccount yoou=new BankAccount();//���� ����
		yoon.initAccount=("12-34-89","990990-9090990",10000);//�ʱ�ȭ
		
		BankAccount park=new BankAccount();//���� ����
		park.initAccount=("33-55-09","770088-5959007",10000);//�ʱ�ȭ

		yoon.deposit(5000);
		park.deposit(3000);

		yoon.withdraw(2000);
		park.withdraw(2000);

		yoon.CheckMyBalance();
		park.CheckMyBalance();
	}
}
class BankAccount{
	String accNumber; //���¹�ȣ
	String ssNumber;  //�ֹι�ȣ
	int balance=0;    //�����ܾ�

	//�ʱ�ȭ�� ���� �޼ҵ�
	public initAccount(String acc,String ss,int bal){
		accNumber=acc; 
		ssNumber=ss;   
		balance=bal; //���� ������ ���ݾ����� �ʱ�ȭ
	}
	public int deposit(int amount){
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount){
		balance-=amount;
		return balance;
	}
	public int checkMyBalance(){
		System.out.println("���¹�ȣ:"+accNumber);
		System.out.println("�ֹι�ȣ:"+ssNumber);
		System.out.println("�ܾ�:"+balance+'\n');
		return balance;
	}
}