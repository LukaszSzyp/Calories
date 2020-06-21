package pl.Lukasz.Calories.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.Lukasz.Calories.Entity.Users;

public interface AuthenticatingRepository extends CrudRepository <Users, Integer> {
@Query(value = "select * from users where username= ?1", nativeQuery = true)
    public Users getUserByUsername(@Param("username") String username);
}
