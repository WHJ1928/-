package �ļ���;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import study.Register;

public class Link_infor extends Register{
	  public  void load(){
		  File f = new File("E:\\eclipse-jee-neon-3\\eclipse space\\study\\����\\study\\login_data.txt");
		  String content = "\r\n"+"qwqwer";
		  
		  FileWriter fw = null;
		  BufferedWriter bw = null;
		  try{
	            if(!f.exists()){
	                f.createNewFile();
	            }
	             fw=new FileWriter(f.getAbsoluteFile(),true);  //true��ʾ����׷��������  
//	             fw=new FileWriter(f.getAbsoluteFile()); //��ʾ��׷��
	             bw=new BufferedWriter(fw);
	             bw.write(content);
	             bw.close();
	        }catch(Exception e){
	           e.printStackTrace();
	        }
	        
	    }
}
