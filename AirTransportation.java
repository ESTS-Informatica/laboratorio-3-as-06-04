
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    // instance variables - replace the example below with your own
    private String name;
    private int numberOfContainers;

    /**
     * Constructor for objects of class AirTransportation
     */
    public AirTransportation(String name, int numberOfContainers)
    {
        // initialise instance variables
        //x = 0;
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        setFees(4.0);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNumberOfContainers(){
        return this.numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;
    }


}
