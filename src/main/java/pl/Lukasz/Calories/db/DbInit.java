package pl.Lukasz.Calories.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.Lukasz.Calories.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args){

        this.userRepository.deleteAll();
        // Create users
        User user = new User("user",passwordEncoder.encode("password"), "USER");
        User admin = new User("admin",passwordEncoder.encode("password"), "ADMIN");
        User manager = new User("manager",passwordEncoder.encode("password"), "MANAGER");

        List<User> users = Arrays.asList(user,admin,manager);
        // Save to db
        this.userRepository.saveAll(users);

    }
}
