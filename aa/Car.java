package models;

import file_manager.SchemaId;
import file_manager.Stream;
import file_manager.documentations.Constant;

import java.io.Serial;
import java.io.Serializable;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Car implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    // ====================== Fields ======================
    private int id;
    private String brand;
    private String model;
    private String type;
    private String color;
    private int year;
    private int quantityAvailable;
    private double baseRate;

    // ====================== Constructors ======================
    public Car() {}

    public Car(int id, String brand, String model, String type, String color, int year, int quantityAvailable, double baseRate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.year = year;
        this.quantityAvailable = quantityAvailable;
        this.baseRate = baseRate;
    }

    // ====================== Getters ======================
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // ====================== Setters ======================
    public void setId(int id) {
        this.id = id;
        // ToDo: Write updated field to file
    }

    public void setBrand(String brand) {
        this.brand = brand;
        // ToDo: Write updated field to file
    }

    public void setModel(String model) {
        this.model = model;
        // ToDo: Write updated field to file
    }

    public void setType(String type) {
        this.type = type;
        // ToDo: Write updated field to file
    }

    public void setColor(String color) {
        this.color = color;
        // ToDo: Write updated field to file
    }

    public void setYear(int year) {
        this.year = year;
        // ToDo: Write updated field to file
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
        // ToDo: Write updated field to file
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
        // ToDo: Write updated field to file
    }

    // ==================== Stream Configs ====================

    private int m_roll;
    // generic type
    private static final String myName = "Car";
    private static final String myDirPath = Constant._TableDirectory + myName + "/";

    // generic type
    public void display(){
        System.out.printf(String.valueOf("*").repeat(40) + "\n");
        System.out.printf("%-10s%-10s%-10s\n", "roll");
        System.out.printf("%-10d%-10s%-10f\n", m_roll);
        System.out.printf(String.valueOf("*").repeat(40) + "\n");
    }

    public void write()
    {
        SchemaId database = new SchemaId();
        database.incrementSize(myName);
        m_roll = database.getRoll(myName);

        // generic type
        Stream<Car> stream = new Stream<>();
        stream.writer(this,  myDirPath + m_roll);
    }

    public void delete()
    {
        SchemaId database = new SchemaId();
        database.decrementSize(myName);

        // generic type
        Stream<Car> stream = new Stream<>();
        stream.deleter( myDirPath + m_roll);

    }

    public Car read(int roll)
    {
        // generic type
        Stream<Car> stream = new Stream<>();
        return stream.reader(myDirPath + roll);
    }

    // generic type
    private static Car read(String filePath)
    {
        // generic type
        Stream<Car> stream = new Stream<>();
        return stream.reader(filePath);
    }

    // generic type
    public static List<Car> readAll()
    {
        Stream<Car> stream = new Stream<>(); // generic type
        List<Car> ls = new ArrayList<>(); // generic type

        try {
            Files.walk(Paths.get(myDirPath), Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS)
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        ls.add(read(path.toString()));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ls;
    }
}
