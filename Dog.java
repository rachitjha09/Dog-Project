
/**
 * Tracks info about a dog.
 *
 * @author (Rachit Jha)
 * @version (9/19/23)
 */
public class Dog
{
    private static int townLicenseNum=100;
    public static final double PI=3.14;
    private String name;
    private int age;
    private double weight;
    private int licenseNum;
    public void speak(){
        System.out.println("Woof!");
    }
    public void speak(String s){
        System.out.println(s);
    }
    public void speak(int n){
        for(int i=0; i<n; i++){
            System.out.println("Woof");
        }
    }
    //toString() for the dog class
    @Override public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nLicense #: " + licenseNum;
    }
    
    public Dog(){
        name="Unknown";
        age=-1;
        weight=0.0;
    }
    
    public Dog(String n, int a, double w){
        name=n;
        weight=w;
        age=a;
        //townLicenseNumber++;
        licenseNum=townLicenseNum++;
    }
    public double getPI(){
        return PI;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public void setName(String newName){
        name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public void setWeight(double newWeight){
        weight=newWeight;
    }
    
    public static void main(String[]args){
        
    }
}
