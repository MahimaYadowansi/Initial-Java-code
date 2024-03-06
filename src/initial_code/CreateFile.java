package initial_code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File myFile=new File("E:\\myFile.txt");
		try {
		myFile.createNewFile();
		System.out.println("file created");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	/*	//writing file
		
		FileWriter fileWriter = new FileWriter("E:\\myFile.txt");
		fileWriter.write("Hey, This is my first file. Hope you like it");
		
		System.out.println("file writtten");
		fileWriter.close();*/
		
		//OR TO WRITE A FILE
		
		File fb=new File("E:\\myFile.txt");
		FileWriter fw= new FileWriter(fb,true); //here true is given so data can append and not overwritten
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("india");
		writer.newLine();
		writer.write("usa");
		System.out.println("new data recorded");
		writer.close();
		
		// reading file
		// we can also manually create file and read its data.
		File f1=new File("E:\\myFile.txt");
		try {
		Scanner sc=new Scanner(f1);
		while(sc.hasNextLine())
		{
			//String line=sc.nextLine();
			//System.out.println(line);
			System.out.println(sc.nextLine());
		}
		sc.close();
	} 
		catch(Exception e)
		{
		e.printStackTrace();
		}
    // deleting the file
	/*	File f2=new File("E:\\myFile.txt");
		if(f2.delete())
		{
			System.out.println("Deleting myFile"+myFile.getName());
		}
		else
		{
			System.out.println("Some error occured while deleting file");
		}*/
}
}
