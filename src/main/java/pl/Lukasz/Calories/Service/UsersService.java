package pl.Lukasz.Calories.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.Lukasz.Calories.Entity.Users;
import pl.Lukasz.Calories.Repository.UsersRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> listAll() {
        return usersRepository.findAll();
    }

    public void save(Users users){
        usersRepository.save(users);
    }

    public Users get(Integer userId) {
        return usersRepository.findById(userId).get();
    }

    public void delete (Integer userId) {
        usersRepository.deleteById(userId);
    }
}
