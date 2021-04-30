package by.akimova.restfull_testtask.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String carModel;
    private String generation;
    private String year;
    private Transmission transmission;
    private Drive drive;
    private Engine engine;
    private String volume;
    private Body body;
    private int price;

    public Car() {
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void getBody() {
        this.body = body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
