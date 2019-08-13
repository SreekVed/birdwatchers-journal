import java.util.Scanner;
import java.util.ArrayList;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    
    ArrayList<Bird> birds = new ArrayList<Bird>();
    Scanner input = new Scanner(System.in);
    
    while(true) {
        System.out.print("? ");
        String in = input.nextLine();
        
        if(in.equals("Add")) {
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Latin Name: ");
            String latinName = input.nextLine();
            birds.add(new Bird(name,latinName));
        }
        
        else if(in.equals("Observation")) {
           
        System.out.print("What was observed:? ");
        String observed = input.nextLine();
        int count=0;
        for(Bird y : birds ) {
            if(y.getName().equals(observed)) {
                y.observe();
                count++;
            }
        }
        if(count==0) System.out.println("Is not a bird!");
        }
        
        else if(in.equals("Statistics")) {
         for(Bird x : birds) {
                System.out.println(x);       
        }
        }
        
        else if(in.equals("Show")) {
        
        System.out.print("What? ");
        String observed = input.nextLine();
        for(Bird y : birds ) {
            if(y.getName().equals(observed)) {
                System.out.println(y);
            }
        }
        
        }
        
        else if(in.equals("Quit"))   break;    

        }
 

    }

}
