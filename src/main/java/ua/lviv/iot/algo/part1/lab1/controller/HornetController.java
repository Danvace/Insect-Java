package ua.lviv.iot.algo.part1.lab1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;
import ua.lviv.iot.algo.part1.lab1.service.HornetService;

import java.util.List;

@RestController
@RequestMapping(path = "/Hornets")
public class HornetController {

    private final HornetService hornetService;

    @Autowired
    public HornetController(final HornetService hornetService) {
        this.hornetService = hornetService;
    }

    @GetMapping
    public List<Hornet> getAllHornets() {
        return hornetService.getHornetMap().values().stream().toList();
    }

    @GetMapping(path = "/{id}")
    public Hornet getHornet(@PathVariable final Integer id) {
        return hornetService.getHornet(id);
    }

    @PostMapping()
    public Hornet postHornet(@RequestBody final Hornet hornet) {
        hornet.setHornetId(hornetService.getNextAvailable());
        hornetService.addHornet(hornet);
        return hornet;
    }


    @PutMapping(path = "/{id}")
    public void putHornet(@RequestBody final Hornet hornet, @PathVariable final Integer id) {
        hornetService.putHornet(id, hornet);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteHornet(@PathVariable final Integer id) {
        hornetService.deleteHornet(id);
    }
}

