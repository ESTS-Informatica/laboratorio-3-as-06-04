
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licencePlate;

    /**
     * Constructor for objects of class GroundTransportation
     */
    public GroundTransportation(String licencePlate)
    {       
        this.licencePlate = licencePlate;   
        super.setFees(3.0);
    }
    
    
    public String getLicensePlate(){
        return this.licencePlate;
    }
    
    public void setLicensePlate(String licencePlate){
        this.licencePlate = licencePlate;
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", super.getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", super.getPriceWithFees()));
        sb.append(String.format("%15s: %s\n", "Matricula", this.getLicensePlate()));
     
        return sb.toString();
    }
}
