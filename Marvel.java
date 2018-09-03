import java.util.Scanner;

public class Marvel{
    public static void main(String[] agrs){
        System.out.println("Hello this is a Marvel Demo"); //To print a line out
        Hero superHero = new Hero ();
        superHero.compileSuperHero1();
        /*
        System.out.println("Please choose a superhero: ");
        Scanner scan = new Scanner(System.in);
        String myLine = scan.nextLine();
        System.out.println("The new name is: "+myLine);
        */
        Hero captainAmerica = new Hero ();
        captainAmerica.compileSuperHero();
    }
}