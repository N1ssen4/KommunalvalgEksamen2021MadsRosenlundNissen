package com.example.kommunalvalgeksamen2021.rest;

import com.example.kommunalvalgeksamen2021.entity.Kandidat;
import com.example.kommunalvalgeksamen2021.entity.Parti;
import com.example.kommunalvalgeksamen2021.repositories.KandidatRepository;
import com.example.kommunalvalgeksamen2021.repositories.PartiRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class KandidatRepositoryTests {

    @Autowired
    private KandidatRepository kandidatRepository;
    @Autowired
    private PartiRepository partiRepository;


    //JUnit test af addOne metode
    @Test
    public void addOneTest(){
        //Arrange
        Kandidat kandidat = new Kandidat();
        List<Kandidat> kandidatListBeforeTest = new ArrayList<>();
        kandidatRepository.findAll().forEach(kandidatListBeforeTest::add);
        kandidat.setNavn("Testnavn");
        kandidat.setParti(new Parti());
        kandidat.getParti().setId(1);

        //Act
        kandidatRepository.save(kandidat);

        List<Kandidat> kandidatListAfterTest = new ArrayList<>();
        kandidatRepository.findAll().forEach(kandidatListAfterTest::add);

        //Assert
        Assertions.assertEquals(kandidatListBeforeTest.size()+1,kandidatListAfterTest.size());

    }
    //JUnit test af deleteOne metode
    @Test
    public void deleteOneTest(){
        //Arrange
        Kandidat kandidat = new Kandidat();
        List<Kandidat> kandidatListBeforeTest = new ArrayList<>();
        kandidatRepository.findAll().forEach(kandidatListBeforeTest::add);

        //Act
        kandidatRepository.deleteById(kandidatListBeforeTest.get(0).getId());

        List<Kandidat> kandidatListAfterTest = new ArrayList<>();
        kandidatRepository.findAll().forEach(kandidatListAfterTest::add);

        //Assert
        Assertions.assertEquals(kandidatListBeforeTest.size()-1,kandidatListAfterTest.size());


    }
    //JUnit test af editOne metode
    @Test
    public void editOneTest(){
        //Arrange
        Parti parti = new Parti();
        Kandidat s = kandidatRepository.findById(16).get();
        partiRepository.findByPartibogstav(s.getParti().getPartibogstav());

        //Act
        s.setNavn("Test2");
        parti.setId(6);
        s.setParti(parti);
        kandidatRepository.save(s);

        //Assert
        Assertions.assertEquals("Test2",kandidatRepository.findById(16).get().getNavn());
        Assertions.assertEquals("Enhedslisten",kandidatRepository.findById(16).get().getParti().getPartinavn());

    }
    //Test af getOne metode
    @Test
    public void getOneTest(){
        //Arrange & Act
        Kandidat kandidat = kandidatRepository.findById(16).get();

        //Assert
        Assertions.assertEquals("Susanne Andersen",kandidat.getNavn());

    }
    //Test af getAll metode
    @Test
    public void getAllTest(){
        //Arrange & Act
        List<Kandidat> kandidatList = new ArrayList<>();
        kandidatRepository.findAll().forEach(kandidatList::add);

        //Assert
        Assertions.assertNotNull(kandidatList);
        Assertions.assertNotEquals(0,kandidatList.size());
    }

}
