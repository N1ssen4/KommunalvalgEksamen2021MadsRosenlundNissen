package com.example.kommunalvalgeksamen2021.repositories;
import com.example.kommunalvalgeksamen2021.entity.Parti;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
@EnableEncryptableProperties

public interface PartiRepository extends CrudRepository<Parti, Integer> {

        Parti findByPartibogstav (String partibogstav);
}
