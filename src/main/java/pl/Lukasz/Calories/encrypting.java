package pl.Lukasz.Calories;


import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class encrypting {
    public static void main(String[] args) {
        String encoded=new BCryptPasswordEncoder().encode("admin");
        System.out.println(encoded);
    }

}