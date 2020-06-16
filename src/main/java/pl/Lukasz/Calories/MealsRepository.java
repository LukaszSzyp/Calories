package pl.Lukasz.Calories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MealsRepository extends JpaRepository<Meals,Integer> {
}
