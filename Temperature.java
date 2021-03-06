
/**
 * Write a description of class Temperature here.
 *
 * @author (Loua Diomande)
 * @version (4/2/2018)
 */
public class Temperature
{
    private double degreesFahrenheit; // Fahrenheit Temperature
    private double degreesCelsius; // Celsius Temperature
    private double degreesKelvin; // Kelvin Temperature
    
     // Default constructor for Temperature sets the default
     // value of the Temperature object to 0.0 degrees,
     // Fahrenheit with Celsius and Kelvin equivalents.
    public Temperature() {
        this(0.0);
    }

    /**
     *This constructor for Temperature sets the Fahrenheit
     * value to the value from degrees, then calculates
     * equivalent Celsius and Kelvin values using the method
     * setDegreesFahrenheit()
     * 
     * @param degrees degrees Fahrenheit
     */
    public Temperature(double degrees) {
        setDegreesFahrenheit(degrees);
    }

    /**
     * The setDegreesFahrenheit method sets the Fahrenheit temperature
     * and its Celsius and Kelvin equivalents
     * 
     * @param degrees The Fahrenheit value to store 
     */
    public void setDegreesFahrenheit(double degrees) {
        degreesFahrenheit = degrees; // set Fahrenheit value
        degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
        degreesKelvin = degreesCelsius + 273.15; // set Kelvin value
    }

    /**
     * getDegreesCelsius retrieves the Celsius temperature value
     * 
     * @return a double value containing the Celsius temperature
     */
    public double getDegreesCelsius() {
        return degreesCelsius;
    }

    /**
     * getDegreesKelvin retrieves the Kelvin temperature value
     *
     * @return a double value containing the Kelvin temperature
     */
    public double getDegreesKelvin() {
        return degreesKelvin;
    }
}


    
    
    
    
    
    
    
    
    
    
    

