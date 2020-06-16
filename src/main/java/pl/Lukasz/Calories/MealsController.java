package pl.Lukasz.Calories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MealsController {

    @Autowired
    private MealsService service;

    @GetMapping("/meals")
    public List<Meals> list() {
        return service.listAll();
    }
}
