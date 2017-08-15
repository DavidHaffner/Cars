/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author Student
 */
public class Car {
    private String manufacture;
    private String modelName;
    private int year;
    private static int counter=0;
    private int speed;
    private Engine engine;
    private ServiceBook serviceBook;
    
    public Car (String manufacture, String modelName, int year, int speed, String engine) {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.year = year;
        counter ++;
        this.speed = speed;
        this.engine = new Engine (engine);
    }
    
    public void setServiceBook(ServiceBook serviceBook) {
        this.serviceBook = serviceBook;
    }
    
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getManufacture() {
        return manufacture;
    }
    public String getModelName() {
        return modelName;
    }
    public int getYear() {
        return year;
    }
    public int getSpeed() {
        return speed;
    }
    public Engine getEngine() {
        return engine;
    }
    
    protected void finalize () throws Throwable {
        try {
            counter --;
        } finally {
            super.finalize();
        }
    }
    public String toString () {
        return "Manufacture: "+manufacture+"\nModel name: "+modelName+
                "\nService records: "+this.serviceBook.getServiceRecords();
    }
}
