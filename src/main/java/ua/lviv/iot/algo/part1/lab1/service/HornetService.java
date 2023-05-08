package ua.lviv.iot.algo.part1.lab1.service;

import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;

import java.util.HashMap;
import java.util.Map;

@Service
public class HornetService {

    private final Map<Integer, Hornet> hornetMap;
    private Integer nextAvailable = 1;

    public HornetService() {
        hornetMap = new HashMap<>();
    }


    public void addHornet(final Hornet hornet) {
        hornetMap.put(this.nextAvailable++, hornet);
    }

    public void deleteHornet(final Integer id) {
        hornetMap.remove(id);
    }

    public Hornet getHornet(final Integer id) {
        return hornetMap.get(id);
    }

    public void putHornet(final Integer id, final Hornet hornet) {
        hornetMap.replace(id, hornet);
    }


    public Map<Integer, Hornet> getHornetMap() {
        return new HashMap<>(hornetMap);
    }

    public Integer getNextAvailable() {
        return nextAvailable;
    }
}
