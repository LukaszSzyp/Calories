package pl.Lukasz.Calories.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.Lukasz.Calories.Entity.Meals;
import pl.Lukasz.Calories.Repository.MealsRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MealsService {

    @Autowired
    private MealsRepository repo;

    public List<Meals> listAll(Integer user) {
       return repo.findByUser(user);
    }

    public void save(Meals meals){
        repo.save(meals);
    }

    public Meals get(Integer meals_id){
        return (Meals) repo.findById(meals_id).get();
    }

    public void delete (Integer meals_id){
        repo.deleteById(meals_id);
    }

    public List<Meals> findMeals (String dateFrom, String dateTo, String timeFrom, String timeTo, Integer user){
        return repo.findMeals(dateFrom, dateTo, timeFrom, timeTo, user);
    }

    public Integer sumCaloriesToday (){
        return repo.sumCaloriesToday();
    }
}
