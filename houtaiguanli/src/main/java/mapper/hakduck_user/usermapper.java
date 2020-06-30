package mapper.hakduck_user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pojo.hakduck_user.User;


@Mapper
public interface usermapper {
    @Select("select * from user where user_email=#{user_email} and password=@{password}")
    public User submitForm(String user_email, int password);
}
