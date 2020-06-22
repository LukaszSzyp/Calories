package pl.Lukasz.Calories.Entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Users {

    private Integer userid;
    private String username;
    private String password;
    private String role;
    private Boolean enabled;

    public Users(){
    }

    public Users(Integer userid, String username, String password, String role, Boolean enabled) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
