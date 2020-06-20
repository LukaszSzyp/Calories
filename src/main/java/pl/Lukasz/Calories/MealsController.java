package pl.Lukasz.Calories;

import org.springframework.beans.factory.annotation.*;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MealsController {

    @Autowired
    private MealsService service;

    @GetMapping("/meals")
    public List<Meals> list(@Param("user") Integer user) {
        return service.listAll(user);
    }

    @GetMapping("/meals/{id}")
    public ResponseEntity<Meals> get(@PathVariable Integer id) {
        try {
            Meals meals = service.get(id);
            return new ResponseEntity<Meals>(meals, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Meals>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/meals/{id}")
    public ResponseEntity<?> update(@RequestBody Meals meals, @PathVariable Integer id) {
        try {
            Meals existMeals = service.get(id);
            service.save(meals);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/meals")
    public void add(@RequestBody Meals meals) {
        service.save(meals);
    }

    @DeleteMapping("/meals/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
