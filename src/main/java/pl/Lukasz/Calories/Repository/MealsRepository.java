package pl.Lukasz.Calories.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Lukasz.Calories.Entity.Meals;

import java.util.List;

public interface MealsRepository extends JpaRepository<Meals,Integer> {
    List<Meals> findByUser (Integer user);
}
