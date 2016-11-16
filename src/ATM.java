import java.util.Scanner;

/**
 * Created by noelaniekan on 11/16/16.
 */
public class ATM  {
    public static Scanner scanner = new Scanner(System.in);
    public static Transaction transaction = new Transaction();

    public static void main (String[] args) throws Exception{
        System.out.println("Welcome, customer");

        transaction.chooseName();
        transaction.chooseWhatWouldYouLikeToDo();



    }


}
