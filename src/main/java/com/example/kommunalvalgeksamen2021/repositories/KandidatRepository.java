package com.example.kommunalvalgeksamen2021.repositories;

import com.example.kommunalvalgeksamen2021.entity.Kandidat;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@EnableEncryptableProperties

public interface KandidatRepository extends CrudRepository<Kandidat, Integer> {

        Iterable<Kandidat> findByParti_Id (int parti_id);

}
