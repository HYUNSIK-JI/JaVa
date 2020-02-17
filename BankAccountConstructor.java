class BankAccountConstructor{
	public static void main(String[] args){
		BankAccount yoou=new BankAccount("12-34-89","990990-9090990",10000);
		BankAccount park=new BankAccount("33-55-09","770088-5959007",10000);

		yoon.deposit(5000);
		park.deposit(3000);

		yoon.withdraw(2000);
		park.withdraw(2000);

		yoon.CheckMyBalance();
		park.CheckMyBalance();
	}
}
class BankAccount{
	String accNumber; //°èÁÂ¹øÈ£
	String ssNumber;  //ÁÖ¹Î¹øÈ£
	int balance=0;    //¿¹±İÀÜ¾×

	public BankAccount(String acc,String ss,int bal){
		accNumber=acc; 
		ssNumber=ss;   
		balance=bal;
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
		System.out.println("°èÁÂ¹øÈ£:"+accNumber);
		System.out.println("ÁÖ¹Î¹øÈ£:"+ssNumber);
		System.out.println("ÀÜ¾×:"+balance+'\n');
		return balance;
	}
}