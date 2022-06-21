import java.util.Scanner;;

public class HelloBrother {
    

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        
        System.out.println("qual é o seu nome:");

        String name = scann.nextLine();

        System.out.println("qual sua idade");

        int age = scann. nextInt();

        System.out.println("Nome do desgraçado é " + name + " e a idade é  " + age + " anos."); 

        scann.close();
    }

}
