package com.example.kommunalvalgeksamen2021.entity;

import javax.persistence.*;

@Entity
public class Parti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    private String partinavn;
    private String partibogstav;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartinavn() {
        return partinavn;
    }

    public void setPartinavn(String partinavn) {
        this.partinavn = partinavn;
    }

    public String getPartibogstav() {
        return partibogstav;
    }

    public void setPartibogstav(String partibogstav) {
        this.partibogstav = partibogstav;
    }

    public Parti(int id, String partinavn, String partibogstav) {
        this.id = id;
        this.partinavn = partinavn;
        this.partibogstav = partibogstav;
    }
    public Parti(){

    }

    @Override
    public String toString() {
        return "Parti{" +
                "id=" + id +
                ", partinavn='" + partinavn + '\'' +
                ", partibogstav='" + partibogstav + '\'' +
                '}';
    }
}