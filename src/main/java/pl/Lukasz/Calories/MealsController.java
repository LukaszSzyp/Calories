package pl.Lukasz.Calories;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

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
