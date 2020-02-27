package com.cjc.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader f =new FileReader("D:\\SeleniumTest\\BufferedWriter");
BufferedReader b=new BufferedReader(f);
String s=b.readLine();
System.out.println(s);
String s1=b.readLine();
System.out.println(s1);
String s2=b.readLine();
System.out.println(s2);
b.close();
	}

}
