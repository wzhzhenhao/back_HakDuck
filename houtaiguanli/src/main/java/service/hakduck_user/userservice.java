package service.hakduck_user;

import mapper.hakduck_user.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.hakduck_user.User;

@Service
public class userservice implements usermapper {
    @Autowired
    private usermapper mapper;
    @Override
    public User submitForm(String user_email, int password) {
        return mapper.submitForm(user_email,password);
    }
}
