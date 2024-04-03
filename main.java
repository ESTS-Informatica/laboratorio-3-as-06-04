import java.util.HashSet;

/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main extends HashSet<Transport>
{
    // instance variables - replace the example below with your own
    private ShippingCompany sCompany;

    /**
     * Constructor for objects of class main
     */
 
public void main(){
        this.sCompany = new ShippingCompany("RELIABLE-MOVING");
        Lorry exampleLorry = new Lorry("1234-TEST", 1, 1);
        Van exampleVan = new Van("1234-VAN", 1);
        sCompany.addToService(exampleLorry);
        sCompany.addToService(exampleVan);
        sCompany.toString();
    }
}
