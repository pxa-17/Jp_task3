import java. util.Scanner;


public class task3 {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Dollar");
        System.out.println("3 Euro");
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

public static void Rupee_to_other(double amt) {
    System.out.println("1 Rupee = " + 0.012 + " Dollar");
    System.out.println();

    System.out.println(amt+" Rupee = " + (amt*0.012) + " Dollar");
    System.out.println();

    System.out.println("1 Rupee = " + 0.011 + " Euro");
    System.out.println();
    System.out.println(amt+" Rupee = " + (amt*0.011) + " Euro");
    System.out.println();

}
    public static void Dollar_to_other(double amt) {
    System.out.println("1 Dollar = " + 81.91 + " Rupee");
    System.out.println();
    System.out.println(amt+" Dollar = " + (amt*81.91) + " Rupee");
    System.out.println();

    System.out.println("1 Dollar= " + 0.91 + " Euro");
    System.out.println();

    System.out.println(amt+" Dollar = " + (amt*0.91) + " Euro");
}   
    public static void Euro_to_other(double amt){
    System.out.println("1 Euro = " + 89.82 + " Rupee");
    System.out.println();
    System.out.println(amt+" Euro = " + (amt*89.82) + " Rupee");
    System.out.println();

    System.out.println("1 Euro = " + 1.10 + " Dollar");
    System.out.println();

    System.out.println(amt+" Euro = " + (amt*1.10) + " Dollar");
}
}
