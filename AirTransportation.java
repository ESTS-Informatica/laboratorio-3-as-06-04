
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
        super.setFees(4.0);
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
        if(numberOfContainers > 0){
        this.numberOfContainers = numberOfContainers;
    }
    }
    
    @Override
    public String getTransportType() {
        return "Transporte Aereo";
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
        sb.append(String.format("%15s: %s\n", "Nome", getName()));
        sb.append(String.format("%15s: %s\n", "NºContentores", getNumberOfContainers()));
        return sb.toString();
    }


}
