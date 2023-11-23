import java.util.Scanner;

public class numberGame {
    int input_data(){
        int user_input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        user_input=sc.nextInt();
        return user_input;
    }
    public static void main(String[] args) {
        int v;
        numberGenerator n=new numberGenerator();
         v= n.returnValue();
        numberGame g = new numberGame();
        int user;
        do {
             user = g.input_data();
            if (user == v) {
                System.out.println("The Number is Correct");
            } else if (user > v) {
                System.out.println("The Number is Too High");
            } else {
                System.out.println("The Number is Too Low");
            }

        }while (user!=v);
    }
}