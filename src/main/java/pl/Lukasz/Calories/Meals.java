package pl.Lukasz.Calories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meals {

    private Integer meals_id;
    //private String date;
    //private String time;
    private String text;
    private Integer calories;
    private Integer user_id;


    public Meals(Integer meals_id, String date, String time, String text, Integer calories, Integer user_id) {
        this.meals_id = meals_id;
        //this.date = date;
        //this.time = time;
        this.text = text;
        this.calories = calories;
        this.user_id = user_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getMeals_id(){
        return meals_id;
    }

    public void setMeals_id(Integer meals_id) {
        this.meals_id = meals_id;
    }
/*
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
    }*/

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

}
