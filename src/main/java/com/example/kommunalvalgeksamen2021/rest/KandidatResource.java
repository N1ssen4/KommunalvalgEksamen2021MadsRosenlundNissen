package com.example.kommunalvalgeksamen2021.rest;

import com.example.kommunalvalgeksamen2021.entity.Kandidat;
import com.example.kommunalvalgeksamen2021.entity.Parti;
import com.example.kommunalvalgeksamen2021.repositories.KandidatRepository;
import com.example.kommunalvalgeksamen2021.repositories.PartiRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/samsokv")
public class KandidatResource {

    KandidatRepository kandidatRepository;
    PartiRepository partiRepository;

    public KandidatResource(KandidatRepository kandidatRepository, PartiRepository partiRepository) {
        this.kandidatRepository = kandidatRepository;
        this.partiRepository = partiRepository;
    }

    @GetMapping
    Iterable<Kandidat> getAll(){
        return kandidatRepository.findAll();
    }

    @GetMapping("/parti/{parti_id}")
    Iterable<Kandidat> getByParti(@PathVariable ("parti_id") int parti_id){
        return kandidatRepository.findByParti_Id(parti_id);
    }

    @GetMapping("/{id}")
    Kandidat getOne(@PathVariable("id") int id){
        return kandidatRepository.findById(id).get();
    }

    @PostMapping()
    Kandidat addOne (@RequestBody Kandidat kandidat){
        Parti parti = partiRepository.findByPartibogstav(kandidat.getParti().getPartibogstav());
        kandidat.setParti(parti);
        return kandidatRepository.save(kandidat);
    }

    @GetMapping("/parti")
    Iterable<Parti> getAllParti(){
        return partiRepository.findAll();
    }

    @PutMapping("/{id}")
    Kandidat editOne(@RequestBody Kandidat kandidat, @PathVariable("id") int id){
        Kandidat s = kandidatRepository.findById(id).get();
        Parti parti = partiRepository.findByPartibogstav(kandidat.getParti().getPartibogstav());
        s.setNavn(kandidat.getNavn());
        s.setParti(parti);
        return kandidatRepository.save(s);
    }

    @DeleteMapping("/{id}")
    void deleteOne (@PathVariable("id") int id){
        kandidatRepository.deleteById(id);
    }
}
