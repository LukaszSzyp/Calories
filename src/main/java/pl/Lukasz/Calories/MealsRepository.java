package pl.Lukasz.Calories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealsRepository extends JpaRepository<Meals,Integer> {
    List<Meals> findByUser (Integer user);
}
