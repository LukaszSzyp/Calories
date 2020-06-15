package pl.Lukasz.Calories;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.Lukasz.Calories.db.UserRepository;
import pl.Lukasz.Calories.model.User;

@Service
public class UserPrincipalDetailsServices implements UserDetailsService {
    private UserRepository userRepository;

    public UserPrincipalDetailsServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(s);
        UserPrincipal userPrincipal = new UserPrincipal(user);

        return userPrincipal;
    }
}
