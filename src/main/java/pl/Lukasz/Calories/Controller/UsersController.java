package pl.Lukasz.Calories.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.Lukasz.Calories.Entity.Users;
import pl.Lukasz.Calories.Service.UsersService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<Users> listAll(){
        return usersService.listAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Users> get(@PathVariable Integer id) {
        try {
            Users users = usersService.get(id);
            return new ResponseEntity<Users>(users, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/users/{id}")
    public ResponseEntity<?> update(@RequestBody Users users, @PathVariable Integer id) {
        try {
            Users existMeals = usersService.get(id);
            usersService.save(users);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/users")
    public void add(@RequestBody Users users) {
        usersService.save(users);
    }

    @PostMapping("/newAccount")
    public void addNewAccount(@RequestBody Users users) {
        usersService.save(users);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Integer id) {
        usersService.delete(id);
    }

}
