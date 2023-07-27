package org.java.travel;

import java.time.LocalDate;
import java.time.Period;

public class Vacanza {

    //ATTRIBUTI
    private String destinazione;
    private LocalDate datainizio;
    private LocalDate datafine;

    //COSTRUTTORI
    public Vacanza(String destinazione, LocalDate datainizio, LocalDate datafine) throws RuntimeException{
        //CONTROLLI

        if (destinazione==null || destinazione.isEmpty()){
            throw new RuntimeException("destinazione must not be null or empty");
        }

        if(datainizio==null || datainizio.isAfter(LocalDate.now())) {
            throw new RuntimeException("datainizio must not be null or after datafine");
        }

        if(datafine==null || datafine.isBefore(datainizio)) {
            throw new RuntimeException("datafine must not be null or before datainizio");
        }

        this.destinazione = destinazione;
        this.datainizio = datainizio;
        this.datafine = datafine;
    }


    //GETTERS E SETTERS


    public String getDestinazione() {
        return destinazione;
    }

    public void setDestinazione(String destinazione) throws RuntimeException {
        //FACCIO ANCHE QUA LA VALIDZIONE
        if (destinazione==null || destinazione.isEmpty()){
            throw new RuntimeException("destinazione must not be null or empty");
        }
        //SE PASSA MODIFICO IL VALORE
        this.destinazione = destinazione;
    }

    public LocalDate getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(LocalDate datainizio) throws RuntimeException {
        //VALIDAZIONE
        if(datainizio==null || datainizio.isAfter(LocalDate.now())) {
            throw new RuntimeException("datainizio must not be null or after datafine");
        }
        //SE PASSA MODIFICO IL VALORE
        this.datainizio = datainizio;
    }

    public LocalDate getDatafine() {
        return datafine;
    }



    public String setDatafine(LocalDate datafine) throws RuntimeException {
        //VALIDAZIONE
        if(datafine==null || datafine.isBefore(datainizio)) {
            throw new RuntimeException("datafine must not be null or before datainizio");
        }
        //SE PASSA MODIFICO IL VALORE
        this.datafine = datafine;



        //METODI

        public int getDays() {
            Period days=Period.between(datainizio, datafine);
            return days.getDays();
        }

        @Override
        public String toString() {
            return "Vacanza{" +
                    "destinazione='" + destinazione + '\'' +
                    ", datainizio=" + datainizio +
                    ", datafine=" + datafine +
                    '}';
        }

        }
    }

