package ��¼ģ��;

import java.util.Scanner;

public class Regist {
    UserDao ud = new Start();// ��̬
    public void add(){
        Scanner put = new Scanner(System.in);
        System.out.println("--------------ע�����--------------");
        System.out.println("�������û�����");
        String newUsername = put.nextLine();
        System.out.println("���������룺");
        String newPassword = put.nextLine();
        System.out.println("��������ʵ������");
        String newname = put.nextLine();
        System.out.println("���������֤�ţ�");
        String newIDcard = put.nextLine();
        System.out.println("�������Ա�");
        String newsex = put.nextLine();
        System.out.println("�������ͥסַ��");
        String newaddress = put.nextLine();
        System.out.println("������绰��");
        String newtel = put.nextLine();
        // ���û����������װ��һ��������
        User user = new User("qwer", "123","����", "12", "Ů", "ɽ��ʡ", "12345678");
        // ����ע�Ṧ��
        // ������ʹ��
       ud.regist(null);
        System.out.println("ע��ɹ�");
    }
}
