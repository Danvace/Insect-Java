package ua.lviv.iot.algo.part1.lab1.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;

import java.util.HashMap;
import java.util.Map;

@Service
@Getter
public class HornetService {

    private final Map<Integer, Hornet> hornetMap;
    private Integer nextAvailable = 1;

    public HornetService() {
        hornetMap = new HashMap<>();
    }

    public Hornet findById(Integer id) {
        return getHornet(id);
    }

    public void addHornet(Hornet hornet) {
        hornetMap.put(this.nextAvailable++, hornet);
    }

    public void deleteHornet(Integer id) {
        hornetMap.remove(id);
    }

    public Hornet getHornet(Integer id) {
        return hornetMap.get(id);
    }

    public void putHornet(Integer id, Hornet hornet) {
        hornetMap.replace(id, hornet);
    }
}
