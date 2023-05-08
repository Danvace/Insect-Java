package ua.lviv.iot.algo.part1.lab1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;
import ua.lviv.iot.algo.part1.lab1.service.HornetService;

import java.util.List;

@RestController
@RequestMapping(path = "/hornet")
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
    public ResponseEntity<Hornet> getHornet(@PathVariable final Integer id) {
        Hornet hornet = hornetService.getHornet(id);
        if (hornet == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(hornet);
    }

    @PostMapping()
    public ResponseEntity<Hornet> create(@RequestBody final Hornet hornet) {
        hornet.setHornetId(hornetService.getNextAvailable());
        hornetService.addHornet(hornet);
        return ResponseEntity.ok().body(hornet);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Hornet> update(@RequestBody final Hornet hornet, @PathVariable final Integer id) {
        hornetService.putHornet(id, hornet);
        if (!hornetService.getHornetMap().containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(hornet);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Hornet> delete(@PathVariable final Integer id) {
        hornetService.deleteHornet(id);
        if (!hornetService.getHornetMap().containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }
}

