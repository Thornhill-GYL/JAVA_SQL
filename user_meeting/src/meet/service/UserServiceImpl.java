package meet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meet.entity.Myuser;
import meet.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper test;
	
	@Override
	public boolean Insertuser(int id, String name,String real_name,String word, String phone,String mail)
	{
		
		Myuser user_1=new Myuser(id,name,real_name,word,phone,mail);
		user_1.setUser_role(1);
		user_1.setUser_credit(100);
		user_1.setIf_in(0);
		int num = test.Insertuser(user_1);
		return (num==1);
	}
	@Override
	public boolean deleteuser(int id)
	{
		
		int num= test.Deleteuser(id);
	    return (num==1);
			
	}
	@Override
	public boolean Updateuser(int id, String name,String real_name,String word,String phone,String mail)
	{
		Myuser user_3=new Myuser(id,name,real_name,word,phone,mail);
		
		int flag=test.updateuser(user_3);
		return (flag==1);
	}
	@Override
	public Myuser searchuser(int id)
	{
		Myuser sea=test.Searchuser(id);
		if(sea==null)
			sea=new Myuser(0,"defaultname","defaultname","defaultname","defaultname","defaultname");
		
		return sea;
	}
}
