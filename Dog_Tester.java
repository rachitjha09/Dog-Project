import java.util.*;
import java.io.*;
/**
 * Code to rest the Dog Class
 *
 * @author (Rachit Jha)
 * @version (9/19/3)
 */
public class Dog_Tester
{
    public static void main(String[]args){
        Dog a=new ShowDog();
        Dog b=new Poodle();
        Dog c=new Chihuahua();
        Dog d=new Beagle();
        Dog e=new Poodle();
        Dog f=new Poodle();
        Dog g=new Basenji();
        Dog h=new Poodle();
        
        Dog pack[]={a, b, c, d, e, f, g, h};
        ArrayList<Poodle> x=new ArrayList<Poodle>();
        for(Dog y:pack){
            if(y instanceof Poodle == true){
                x.add((Poodle) y);
            }
        }
        System.out.println(x);
    }
}
