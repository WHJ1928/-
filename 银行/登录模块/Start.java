package 登录模块;

import java.util.ArrayList;

import cn.itcast.pojo.User;

//这是用户操作的具体实现类利用集合
public class Start implements UserDao {
    // 为了让多个方法能够使用同一个集合，就把集合定义为成员变量
    // 为了不让外人看到，用private
    // 为了让多个对象共享同一个成员变量，用static
    private static ArrayList<User> array = new ArrayList<User>();
    User user = new User();
	@Override
	public boolean isLogin(String username, String password) {
// 遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;
        for (User u : array) {
            if (u.getUsername().equals(username)
                    && u.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
	}
	@Override
	public void regist(cn.itcast.pojo.User user) {
        // 把用户信息存储集合
        // ArrayList<User> array = new ArrayList<User>();
        array.add(user);
	}

          
 
}
