package com.example.demo.models;

import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class UsuarioModel{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    //Atributos
    private String brand;
    private String model;
    private int maximum_speed;
    private int engine;
    private String features;
    private String launch_date;



    //Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaximum_speed() {
        return maximum_speed;
    }

    public void setMaximum_speed(int maximum_speed) {
        this.maximum_speed = maximum_speed;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }




    
}