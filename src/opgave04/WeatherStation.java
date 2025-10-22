package opgave04;

public class WeatherStation {
    private double temperature;
    private double bar;

    public WeatherStation(){
        temperature = 0;
        bar = 1;
    }



    //F =°C * 1.8 + 32
    //1 bar = 14.503773773 PSI

    //The data fields temperature (in °C) and pressure (in bar).
    //I n instructor that creates a Weatherstation where temperature is
    //| 0 (°C) and pressure is 1 (bar).
    //f A constructor that constructs a Weatherstation object with particular tem-
    //■perature (in °C) and pressure (in bar).
    //MyProgrammingLab
    //24 Chapter 10 Object-Oriented Thinking
    //■ A static method that constructs a Weatherstation object with imperial
    //unit values, so temperature in °F and pressure in PSI (It should automatically
    //convert to the valid metric representation before assigning to the data fields)
    //■ Two getter methods for the data fields temperature and pressure.
    //■ Two getter methods that convert the data fields to corresponding imperial
    //units (°F and PSI).
    //■ Methods named setTemperature(double temperature) and set-
    //Pressure (double pressure) that set the data fields using metric values
    //■ Methods named setTemperatureFahrenhei t (double temperature) and
    //setPressurePSI (doubl e pressure) that set the data fields using imperial
    //values (They should automatically convert to the underlying metric representation.)
    //Draw the UML diagram for the class, then implement the class. Write a test
    //programs that creates three Weatherstation objects (using new Weather-
    //Station(), new Weatherstation(35, 0.5), and Weatherstation,
    //f romlmperi al (68, 21)) and displays their temperature and pressure, in both
    //metric units (°C and bar) and imperial units (°F and PSI)
}
