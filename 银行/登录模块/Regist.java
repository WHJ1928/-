package 登录模块;

import java.util.Scanner;

public class Regist {
    UserDao ud = new Start();// 多态
    public void add(){
        Scanner put = new Scanner(System.in);
        System.out.println("--------------注册界面--------------");
        System.out.println("请输入用户名：");
        String newUsername = put.nextLine();
        System.out.println("请输入密码：");
        String newPassword = put.nextLine();
        System.out.println("请输入真实姓名：");
        String newname = put.nextLine();
        System.out.println("请输入身份证号：");
        String newIDcard = put.nextLine();
        System.out.println("请输入性别：");
        String newsex = put.nextLine();
        System.out.println("请输入家庭住址：");
        String newaddress = put.nextLine();
        System.out.println("请输入电话：");
        String newtel = put.nextLine();
        // 把用户名和密码封装到一个对象中
        User user = new User("qwer", "123","阿光", "12", "女", "山西省", "12345678");
        // 调用注册功能
        // 具体类使用
       ud.regist(null);
        System.out.println("注册成功");
    }
}
