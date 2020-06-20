package pl.Lukasz.Calories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

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
}
