package web.model;

public class Car {

    private String model;

    private int series;

    private String countryOfOrigin;

    public Car(String model, int series, String countryOfOrigin) {
        this.model = model;
        this.series = series;
        this.countryOfOrigin = countryOfOrigin;
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

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", series=" + series +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
