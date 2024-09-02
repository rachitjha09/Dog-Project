
/**
 * Write a description of class CallByValue here.
 *
 * @author (Rachit Jh)
 * @version (a version number or a date)
 */
public class CallByValue
{
    public static void changeDog(Dog a){
        a= new Dog("Fido", 2, 101.7);
    }
    public static void main(String[]args){
        Dog d=new Dog("Luna", 12, 37.5);
        System.out.println(d);
        changeDog(d);
        System.out.println(d);
    }
}