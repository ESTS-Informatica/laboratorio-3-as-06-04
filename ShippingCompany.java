import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany
{
    private String name;
    private ArrayList<Transport> inService;

    /**
     * Constructor for objects of class ShippingCompany
     */
    public ShippingCompany(String name)
    {
        this.name = name;
        this.inService = new ArrayList<Transport>();
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void addToService(Transport transport){
        this.inService.add(transport);
    }
    
    @Override
    public String toString() {
        System.out.println("Transports na colecao:");
        for (Transport i : inService) {
      System.out.println(i.getId() + " | " +  i.getTransportType());
    }
        return "Nome: " + name;   
    }
    
    private Transport getTransport(String id){
        for (Transport i : inService) {
      if(i.getId() == id){
          return i;
      }
    }
    return null;
}


    
    
    public void makeTransportation(String id, String origin, String destination, double price){
        for (Transport i : inService) {
             if(i.getId() == id && i.isAvailable()){
                 i.setOrigin(origin);
                 i.setDestination(destination);
                 i.setPrice(price);
                 i.setAvailable(false);
                 this.addToService(i);
        }
        
        
    }
}
    
}
