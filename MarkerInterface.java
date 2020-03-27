class MarkerInterface{
	public static void main(String[] args){
		Printer prn=new Printer();
		Report doc=new Report("Simple Funny News");
		prn.printContents(doc);
	}
}
interface Upper{ }
interface Lowper{ }

interface Printable{
	String getContents();
}

class Report implements Printable,Upper{
	String cons;

	Report(String cons){
		this.cons=cons;
	}
	public String getContents(){
		return cons;
	}
}
class Printer{
	public void printContents(Printable doc){
		if(doc instanceof Upper){
			System.out.println((doc.getContents()).toUpperCase());
		}
		else if(doc instanceof Lowper){
			System.out.println((doc.getContents()).toLowerCase());
		}
		else
			System.out.println(doc.getContents());
	}
}