import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nummer = 5;
        boolean login = false;

        if (nummer <= 6 ||nummer >= 3){
            System.out.println("Hello world!");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");

        String username = in.nextLine();
        System.out.println("Username is " + username);

        System.out.println("Enter password");
        String password = in.nextLine();
        System.out.println("Password is " + password);

        /*
        if (Objects.equals(username, "noname")&&Objects.equals(password, "noname")){
            System.out.println("Welcome");
            login = true;
        }
        else {
            System.out.println("Wrong password or username");
        }
        for (int i = 0; i < 32; i++){
            System.out.println("Hello world (:");
        }*/

        while (login == true){
            System.out.println("Do you want to login again?");
        }
        for (int i = 0; i < 5; i++){
            System.out.println("Number:");
            int number = in.nextInt();
            if (number > 5){
                System.out.println("Högre än 5!");
            }
        }
    }

}