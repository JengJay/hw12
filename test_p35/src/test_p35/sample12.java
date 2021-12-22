package test_p35;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class sample12 {
	public static void main (String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("GoodBye!");
			
			pw.close();
			
			System.out.println("已經寫入檔案了");
				}
		catch(IOException e) 
		{
			System.out.println("輸出入錯誤");
			
		}
	}

}
