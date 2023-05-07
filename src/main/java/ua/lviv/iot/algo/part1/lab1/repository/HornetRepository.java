package ua.lviv.iot.algo.part1.lab1.repository;

import org.springframework.stereotype.Repository;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;

import java.util.HashMap;
import java.util.Map;

@Repository
public class HornetRepository {
    private final Map<Long, Hornet> hornetMap;

    public HornetRepository() {
        hornetMap = new HashMap<>();
    }

    public void addHornet(Hornet hornet) {
        hornetMap.put(hornet.getId(), hornet);
    }

    public void deleteHornet(long id) {
        hornetMap.remove(id);
    }

    public Hornet getHornet(long id) {
        return hornetMap.get(id);
    }

    public void editHornet(long id, Hornet hornet) {
        hornetMap.replace(id, hornet);
    }


}
