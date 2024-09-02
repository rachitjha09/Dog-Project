
/**
 * Array of Objects
 *
 * @author (Rachit Jha)
 * @version (1/18/24)
 */
public class ArrayOfDogs
{
    public static void main(String[]args){
        Dog[]pack=new Dog[5];
        pack[2]=new Dog("Fifi", 5, 6.7);
        pack[4]=new Dog("Fido", 7, 2.3);
        pack[0]=new Dog("Rover", 5, 56.3);
        
        for(Dog nextDog: pack){
            if(nextDog!=null && nextDog.getName().substring(0, 1).equals("F")){
                System.out.println(nextDog.getName());

            }
        }
    }
}