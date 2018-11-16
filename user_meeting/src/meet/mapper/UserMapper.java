package meet.mapper;

import org.apache.ibatis.annotations.Param;

import meet.entity.Myuser;

public interface UserMapper {
	int Insertuser(Myuser user);
    int Deleteuser(@Param("user_id") int id);
	Myuser Searchuser(@Param("user_id") int id);
    int updateuser(Myuser user);
}
