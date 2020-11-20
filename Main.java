import java.util.Scanner;
public class loginSystem {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String user, pass;
    System.out.println("Enter your username: ");
    user = input.nextLine();
    System.out.println("Enter your password: ");
    pass = input.nextLine();

    if(user.equals("Calvin") && (pass.equals("LincolnHS"))){
      System.out.println("Welcome Calvin");
      }else{
        System.out.println("Incorrect Password. Please Try Again.");
      }
  }
}