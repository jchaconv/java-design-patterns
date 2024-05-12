package core.design.patterns.structural.adapter.weather;

public class WeatherUI {

    public void showTemperature(int zipcode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperatureByZipcode(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(19406);
    }

}
