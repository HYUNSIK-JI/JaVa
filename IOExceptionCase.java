import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.file.BufferedWriter;
import java.io.file.IOException;

class IOExceptionCase{
	public static void main(String[] args){
		Path file=Paths.get("C://javastudy//Simple.txt");
		BufferedWriter write=null;

		try{
			writer=File.newBufferedWriter(file);
			writer.write('A');
			writer.write('Z');

			if(writer!=null)
				writer.close();
			}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}