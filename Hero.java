import java.util.Scanner;
public class Hero
{
    // instance variables
    private String name;
    private int age;
    private int strength;
    private String gender;

    /**
     * Constructor for objects of class Hero
     */
    public Hero(String theName, String theGender,int theAge, int theStrength)
    {
        // initialise instance variables
        name = theName;
        gender = theGender;
        age = theAge;
        strength = theStrength;
    }
    public Hero(){} //empty constructor
    //Getters and Setters for the object
    public void setName(String theName){
        name = theName;
    }
    public String getName()
    {
        return name;
    }
    public void setGender(String theGender){
        gender = theGender;
    }
    public String getGender()
    {
        return gender;
    }
    public void setAge(int theAge)
    {
       age = theAge;
    }
    public int getAge()
    {
        return age;
    }
    public void setStrength(int theStrength){
       strength = theStrength;
    }
    public int getStrength()
    {
        return strength;
    }
    public void compileSuperHero()
    {
        Hero captainAmerica = new Hero ();
        //Setters
        captainAmerica.setName("Captain America");
        captainAmerica.setGender("Male");
        captainAmerica.setAge(29);
        captainAmerica.setStrength(80);
        //Getters
        System.out.println("------------ Information about the superhero --------------");
        System.out.println("Superhero Name:"+captainAmerica.getName());
        System.out.println("Superhero Gender:"+captainAmerica.getGender());
        System.out.println("Superhero Age:"+captainAmerica.getAge());
        System.out.println("Superhero Strength:"+captainAmerica.getStrength());
        System.out.println("-----------------------------------------------------------");
    }
    public void compileSuperHero1()
    {
        Scanner scan = new Scanner(System.in);
        Hero superHero = new Hero ();
        //Setters:
        System.out.println("Please choose a superhero: ");
        superHero.setName(scan.nextLine());
       
        System.out.println("Please choose a gender: ");
        superHero.setGender(scan.nextLine());
        
        System.out.println("Please choose an age: ");
        superHero.setAge(scan.nextInt());
        
        System.out.println("Please choose the strength: ");
        superHero.setStrength(scan.nextInt());
        
       //Setters
       //superHero.setName(" ");
       //superHero.setGender(" ");
       //superHero.setAge();
       //superHero.setStrength();
       
       //Getters
        System.out.println("------------ Information about the superhero --------------");
        System.out.println("Superhero Name:"+superHero.getName());
        System.out.println("Superhero Gender:"+superHero.getGender());
        System.out.println("Superhero Age:"+superHero.getAge());
        System.out.println("Superhero Strength:"+superHero.getStrength());
        System.out.println("-----------------------------------------------------------");
   
    }
    
}