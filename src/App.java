import java.util.Scanner;
import java.lang.Math;

public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner inpuse = new Scanner(System.in);
        int take = 0;
        int breal = 0;
        while(take != -1)
        {
            System.out.println("Welcome to my converter\n-----------------------\n1: Meters ---> Feet\n2: Feet ---> Meters\n3: Inches ---> Centimeters\n4: Centimeters ---> Inches\n-1 to end");
            take = inpuse.nextInt();

            switch(take)
            {
                case 1:
                {
                    System.out.println("Enter Meter: \n");
                    take = inpuse.nextInt();
                    take *= 3.2808;
                    System.out.println("Feet: "+take+" \n");

                }   
                break;

                case 2:
                {
                    System.out.println("Enter Feet: \n");
                    take = inpuse.nextInt();
                    take /= 3.2808;
                    System.out.println("Meter: "+take+" \n");

                }   
                break;

                case 3:
                {
                    System.out.println("Enter Inch: \n");
                    take = inpuse.nextInt();
                    take /= 0.39370;
                    System.out.println("Centi: "+take+" \n");

                }   
                break;
                
                case 4:
                {
                    System.out.println("Enter Centi: \n");
                    take = inpuse.nextInt();
                    take *= 0.39370;
                    System.out.println("Inch: "+take+" \n");

                }   
                break;

                case -1:
                {
                  
                }   
                break;
            
            }
        }
    }
}
