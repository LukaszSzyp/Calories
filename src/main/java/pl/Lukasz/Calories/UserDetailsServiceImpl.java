package pl.Lukasz.Calories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.Lukasz.Calories.Entity.Users;
import pl.Lukasz.Calories.Repository.AuthenticatingRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private AuthenticatingRepository authenticatingRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = authenticatingRepository.getUserByUsername(username);

        if (user == null){
            throw new UsernameNotFoundException("Could not find user");
        }

        return new MyUserDetails(user);
    }
}
