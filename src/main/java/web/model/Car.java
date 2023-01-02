package web.entity;

import java.util.List;

public class Cars {
    private int series;
    private String color;
    private String model;

    public Cars() {

    }

    public Cars(int series, String color, String model) {
        this.series = series;
        this.color = color;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "series=" + series +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
