package pl.bykowski.homework7_1.model;

public class Car {

    private long id;
    private String mark;
    private String model;
    private String year;


    public Car() {
    }

    public Car(long id, String mark, String model, String year) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
