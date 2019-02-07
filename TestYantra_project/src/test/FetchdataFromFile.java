package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FetchdataFromFile {

	public static void main(String[] args) throws Exception {
		String path ="./data/file.txt";
		String writepath = "./data/filewrite.txt";
		FileReader txtfile = new FileReader(path);
        BufferedReader read = new BufferedReader(txtfile);
        String txtread = "";
        FileWriter writer=new FileWriter(writepath);
        while((txtread=read.readLine())!=null) {
        	System.out.println(txtread); 
        	 writer.write(txtread+"\n");
        }
        read.close();
        writer.close();    
	}
}
