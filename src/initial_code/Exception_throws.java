package initial_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

class ReadAndWrite
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		
	}
	void saveFile() throws FileNotFoundException
	{
		FileOutputStream fis=new FileOutputStream("d:/abc.txt");
	}
}
public class Exception_throws {

	public static void main(String[] args) {
		ReadAndWrite rw=new ReadAndWrite();
		try
		{
			rw.readFile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}

}

