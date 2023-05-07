package ua.lviv.iot.algo.part1.lab1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab1.models.Hornet;
import ua.lviv.iot.algo.part1.lab1.repository.HornetRepository;

@Service
public class HornetService {
    private final HornetRepository  hornetRepository;

    @Autowired
    public HornetService() {
        hornetRepository = new HornetRepository();
    }

    public Hornet findById(long id) {
        return hornetRepository.getHornet(id);
    }

    public void addHornet(Hornet hornet) {
        hornetRepository.addHornet(hornet);
    }

    public void putHornet(long id, Hornet hornet) {
        hornetRepository.editHornet(id, hornet);
    }

    public void deleteHornet(long id) {
        hornetRepository.deleteHornet(id);
    }
}
