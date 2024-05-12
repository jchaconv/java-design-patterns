package core.design.patterns.structural.adapter.weather;

public class WeatherAdapter {

    public int findTemperatureByZipcode(int zipcode) {
        String city = null;
        if(zipcode == 19406) {
            city = "New York";
        } else {
            city = "Time Square";
        }
        WeatherFinder finder = new WeatherFinderImpl();

        return finder.find(city);
    }

}
