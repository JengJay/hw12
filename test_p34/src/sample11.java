import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class sample11 {
	public static void main (String[] args) 
	{
		System.out.println("�п�J�r��");
		try 
		{
            BufferedReader br =
            		new BufferedReader(new InputStreamReader(System.in));
			String str =br.readLine();
			System.out.println("�w�g��J�r��"+str);
				}
		catch(IOException e) 
		{
			System.out.println("��X�J���~");
			
		}
	}

}
