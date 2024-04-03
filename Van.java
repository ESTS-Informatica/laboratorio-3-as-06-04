
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int packages;

    /**
     * Constructor for objects of class Van
     */
    public Van(String licencePlate,int packages)
    {
        super(licencePlate);
        super.setLicensePlate(licencePlate);
        this.packages = packages;
    }
    
    public int getPackages(){
        return this.packages;
    }
    
    public void setPackages(int packages){
        this.packages = packages;
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
        sb.append(String.format("%15s: %s\n", "Número de pacotes", this.getPackages()));
     
        return sb.toString();
    }

 
}
