package ����;

public class ��������±� {
	public static void main(String[] args){
		int a []={18,25,7,36,13,2,89,63};
           int c = 0;
           int b = a[0];
            for(int i=0; i<a.length; i++){
            if(a[i] > b){
                b = a[i];
                c = i;
            }
        }
        System.out.println("���������ֵ��"+b+"���±���"+c);
    }
 }

