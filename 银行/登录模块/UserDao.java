package ��¼ģ��;

import cn.itcast.pojo.User;

public interface UserDao {
//��¼����
	public abstract boolean isLogin(String username, String password);
//ע�Ṧ��
	public abstract void regist(User user);
	
}
