package web.model;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private int series;
    private String userName;

    public Car(String model, int series, String userName) {
        this.model = model;
        this.series = series;
        this.userName = userName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
