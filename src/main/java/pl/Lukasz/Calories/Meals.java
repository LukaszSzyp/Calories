package pl.Lukasz.Calories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meals {

    private Integer id;
    private String date;
    private String time;
    private String text;
    private Integer calories;
    private Integer user;


    public Meals(){
    }

    public Meals(Integer id, String date, String time, String text, Integer calories, Integer user) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.text = text;
        this.calories = calories;
        this.user = user;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId(){
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }
}
