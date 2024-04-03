
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    // instance variables - replace the example below with your own
    private String licencePlate;

    /**
     * Constructor for objects of class GroundTransportation
     */
    public GroundTransportation(String licencePlate)
    {
        this.licencePlate = licencePlate;   
        setFees(3.0);
    }
    
    public String getLicensePlate(){
        return this.licencePlate;
    }
    
    public void setLicensePlate(String licencePlate){
        this.licencePlate = licencePlate;
    }

}
