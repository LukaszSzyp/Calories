package pl.Lukasz.Calories.Entity;

import org.springframework.boot.SpringApplication;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {

    private Integer userId;
    private String userName;
    private String password;
    private String role;
    private Integer enabled;

    public Users(){
    }

    public Users(Integer userId, String userName, String password, String role, Integer enabled) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
