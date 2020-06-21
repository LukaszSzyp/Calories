package pl.Lukasz.Calories.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.Lukasz.Calories.Entity.Meals;

import java.util.List;

public interface MealsRepository extends JpaRepository<Meals, Integer> {
    List<Meals> findByUser(Integer user);

    @Query(
            value = "select * from meals where (date>= ?1 and date<= ?2) and (time>= ?3 and time<= ?4) and user= ?5",
            nativeQuery = true)
    List<Meals> findMeals(String dateFrom, String dateTo, String timeFrom, String timeTo, Integer user);

    @Query(
            value = "select sum(calories) from meals where date=current_date()",
            nativeQuery = true)
    Integer sumCaloriesToday ();
}
