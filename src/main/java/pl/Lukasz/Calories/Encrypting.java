package pl.Lukasz.Calories;


import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypting {
    public static void main(String[] args) {
        String encoded=new BCryptPasswordEncoder().encode("marek");
        System.out.println(encoded);
    }
}