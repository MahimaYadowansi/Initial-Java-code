package initial_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Files_detail {

	public static void main(String[] args) throws IOException {
		File fis=new File("E:\\file.txt");
		fis.createNewFile();
		System.out.println("File is created");
        
		
		// writing in file
		File fs=new File("E:\\file.txt");
		FileWriter fw=new FileWriter(fs);
		BufferedWriter writer=new BufferedWriter(fw);
		writer.write("hey, now you can write here.");
		writer.newLine();
		writer.write("This is your second line");
		System.out.println("record is recorded");
		writer.close();
		
		
		//reading file
		File ft=new File("E:\\file.txt");
		FileReader fr=new FileReader(ft);
		BufferedReader read=new BufferedReader(fr);
		String str="";
		while((str=read.readLine())!=null)
		System.out.println(str);
		
		
		
	}

}
