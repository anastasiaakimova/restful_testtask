package by.akimova.restfull_testtask.controllers;

import by.akimova.restfull_testtask.exceptions.NotFoundException;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/car")
public class CarRestController {
    private int counter = 4;
    private List<Map<String, String>> cars = new ArrayList<Map<String, String>>() {
        {
            add(new HashMap<String, String>() {{
                put("id", "1");
                put("text", "First");
            }});
            add(new HashMap<String, String>() {{
                put("id", "2");
                put("text", "Second");
            }});
            add(new HashMap<String, String>() {{
                put("id", "3");
                put("text", "Third");
            }});
        }
    };

    @GetMapping
    public List<Map<String, String>> list() {
        return cars;
    }

    @GetMapping("{id}")
    public Map<String, String> getone(@PathVariable String id) {
        return getCar(id);
    }

    private Map<String, String> getCar(String id) {
        return cars.stream()
                .filter(car -> car.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    // создание
    @PostMapping
    public Map<String, String> create(@RequestBody Map<String, String> car) {
        car.put("id", String.valueOf(counter++));
        cars.add(car);
        return car;
    }

    //обновление записи
    @PutMapping("{id}"
    )
    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> car) {
        Map<String, String> carFromDb = getCar(car.get("id"));
        carFromDb.putAll(car);
        carFromDb.put("id", id);
        return carFromDb;
    }

    //удаление
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        Map<String, String> car = getCar(id);
        cars.remove(car);
    }
}
