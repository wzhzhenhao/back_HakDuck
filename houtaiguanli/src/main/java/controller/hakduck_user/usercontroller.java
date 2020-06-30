package controller.hakduck_user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.hakduck_user.User;
import service.hakduck_user.userservice;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class usercontroller {
    @Autowired
    private userservice userservices;
    @GetMapping("/login")
    public User
}
