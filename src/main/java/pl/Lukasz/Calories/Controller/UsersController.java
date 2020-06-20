package pl.Lukasz.Calories.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Lukasz.Calories.Entity.Users;
import pl.Lukasz.Calories.Service.UsersService;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<Users> listAll(){
        return usersService.listAll();

    }
}
