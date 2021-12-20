package com.example.kommunalvalgeksamen2021.entity;


import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.persistence.*;
@Entity
public class Kandidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    private String navn;

    public Parti getParti() {
        return parti;
    }

    public void setParti(Parti parti) {
        this.parti = parti;
    }

    @ManyToOne
    @JoinColumn(name = "parti_id", referencedColumnName = "id")
    private Parti parti;

    public Kandidat(int id, String navn, Parti parti) {
        this.id = id;
        this.navn = navn;
        this.parti = parti;
    }
    public Kandidat(){

    }

    @Override
    public String toString() {
        return "Kandidat{" +
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", parti=" + parti +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


}