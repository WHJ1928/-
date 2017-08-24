package 登录模块;

import cn.itcast.pojo.User;

public interface UserDao {
//登录功能
	public abstract boolean isLogin(String username, String password);
//注册功能
	public abstract void regist(User user);
	
}
