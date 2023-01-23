import java.util.Scanner;

public class Cirklar {

    // Attributes
Scanner myScanner = new Scanner(System.in);
    double radius = 1.0;

    // Constructors

    public Cirklar(){

    }

    // Methods

    public void Amount(){
        System.out.println("Hur många cirklar vill du skapa?");
        String amount = myScanner.next();
    }

    public void Radius(){
        System.out.println("Hur stor ska radien av cirkeln vara?");
        String radius = myScanner.next();
    }




    // Getter & Setter

}
