package pl.Lukasz.Calories.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Lukasz.Calories.Entity.Users;


public interface UsersRepository extends JpaRepository<Users,Integer> {
}
