import java.util.Random;

public class numberGenerator {
    int number;
    numberGenerator(){
        Random r=new Random();
        number=r.nextInt(101);
        System.out.println("Guess the number 1-100");

}
    int returnValue(){
        return number;
    }


}