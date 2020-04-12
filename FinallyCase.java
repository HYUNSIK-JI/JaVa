import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.file.BufferedWriter;
import java.io.file.IOException;

class FinallyCase{
	public static void main(String[] args){
		Path file=Paths.get("C://javastudy//Simple.txt");
		BufferedWriter writer=nul;;
		
		try{
			writer=Files.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');
			}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(writer!=null)
				writer.close();
			}
	}
}