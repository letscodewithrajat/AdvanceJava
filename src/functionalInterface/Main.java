
package functionalInterface;

/**
 *
 * @author bethan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name );
            }
        };
        gm.greet("Rajat");


        GreetingMessage gm2 = (t) -> {
            System.out.println("Hello "+t);
        };
        gm2.greet("Rajat");

        MessagePrinter mp = ()->{
            System.out.println("This is a message");
        };
        mp.printMessage();
    }

    
}
