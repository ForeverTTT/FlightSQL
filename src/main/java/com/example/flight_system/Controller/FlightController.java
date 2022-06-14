package com.example.flight_system.Controller;

import com.example.flight_system.Mapper.FlightMapper;
import com.example.flight_system.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightMapper flightMapper;

    @GetMapping
    public List<Flight> index() {
        return flightMapper.findAll();
    }

    @PostMapping
    public Integer save(@RequestBody Flight flight) {
        return flightMapper.insert(flight);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id){
        return flightMapper.deleteById(id);
    }

}
