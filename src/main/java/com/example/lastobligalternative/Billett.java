package com.example.lastobligalternative;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;


@Entity
@Table(name = "billetter")
public class Billett {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "filmvalg")
    private String filmvalg;
    @Column(name = "antall")
    private int antall;
    @Column(name = "fornavn")
    private String fornavn;
    @Column(name = "etternavn")
    private String etternavn;
    @Column(name = "tlf")
    private String tlf;
    @Column(name = "epost")
    private String epost;



        public Billett(){}

        public Billett(String filmvalg, int antall, String fornavn, String etternavn, String tlf, String epost) {
            this.filmvalg = filmvalg;
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.tlf = tlf;
            this.epost = epost;
        }

        public String getFilmvalg() {
            return filmvalg;
        }

        public void setFilmvalg(String filmvalg) {
            this.filmvalg = filmvalg;
        }

        public int getAntall() {
            return antall;
        }

        public void setAntall(int antall) {
            this.antall = antall;
        }

        public String getFornavn() {
            return fornavn;
        }

        public void setFornavn(String fornavn) {
            this.fornavn = fornavn;
        }

        public String getEtternavn() {
            return etternavn;
        }

        public void setEtternavn(String etternavn) {
            this.etternavn = etternavn;
        }

        public String getTlf() {
            return tlf;
        }

        public void setTlf(String tlf) {
            this.tlf = tlf;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }
    }

