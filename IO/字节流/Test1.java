package ×Ö½ÚÁ÷;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1 {
  public static void main(String[] args) throws Exception{
	File  qq = new File("123.jpg");
	File  pp = new File("qwe.jpg");
	InputStream in = new FileInputStream(qq);
	OutputStream out = new FileOutputStream(pp);
	
     byte[] datas = new byte[in.available()];
     in.read(datas);
     out.write(datas);
     pp.createNewFile();
   }
}
