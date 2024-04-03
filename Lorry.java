
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    /**
     * Constructor for objects of class Lorry
     */
    public Lorry(String licencePlate,int numberOfPallets, int trailers)
    {
        super(licencePlate);
        super.setLicensePlate(licencePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets(){
        return this.numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public int getTrailers(){
        return this.trailers;
    }
    
    public void setTrailers(int trailers){
        this.trailers = trailers;
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
        sb.append(String.format("%15s: %s\n", "Número de paletes", this.getNumberOfPallets()));
        sb.append(String.format("%15s: %s\n", "Número de atrelados", this.getTrailers()));
     
        return sb.toString();
    }

    
}
