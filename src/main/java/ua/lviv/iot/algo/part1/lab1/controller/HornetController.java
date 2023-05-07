package ua.lviv.iot.algo.part1.lab1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;
import ua.lviv.iot.algo.part1.lab1.service.HornetService;

@RestController
@RequestMapping(path = "/Hornets")
public class HornetController {


    private final HornetService hornetService;

    @Autowired
    public HornetController(HornetService hornetService) {
        this.hornetService = hornetService;
    }

    @GetMapping(path = "/get/{id}")
    public Hornet getHornet(@PathVariable long id) {
        return hornetService.findById(id);
    }

    @RequestMapping(path = "/post")
    @PostMapping()
    public void postHornet() {
        var hornet = new Hornet();
        hornetService.addHornet(hornet);
    }

    @RequestMapping(path = "/edit")
    @PutMapping()
    public void putHornet(@RequestBody Hornet hornet) {
        hornetService.putHornet(hornet.getId(), hornet);
    }

    @RequestMapping(path = "/delete/{id}")
    @DeleteMapping()
    public void deleteHornet(@PathVariable long id) {
        hornetService.deleteHornet(id);
    }


}

