package initial_code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Html_files {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\HtmlFile.html");
		f.createNewFile();
		System.out.println("The file is created");
		//Writing in file
		
		File f1=new File("E:\\HtmlFile.html");
		FileWriter fw=new FileWriter(f1);
		BufferedWriter writer=new BufferedWriter(fw);
		writer.newLine();
		writer.write("<html> <body> <title>AUTOMATION</title><h1>Way 2 Automation</h1><h2>Learning automation testing</h2></body></html>");
		
		writer.close();
		System.out.println("File written");
		
	}

}
