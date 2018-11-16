package meet.service;

import meet.entity.Myuser;

public interface UserService {
	
  public boolean Insertuser(int id, String name,String real_name,String word,String phone, String mail);
  public boolean  deleteuser(int id);
  public boolean Updateuser(int id, String name,String real_name,String word, String phone,String mail);
  public Myuser searchuser(int id);
}
