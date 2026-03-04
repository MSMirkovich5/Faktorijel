import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Upišite neki cijeli broj: ");
        while (!input.hasNextInt()) {
            System.out.print("Upišite neki cijeli broj: ");
            input.nextLine();
        }
        int broj = input.nextInt();
        if (broj < 0){
            throw new Exception("Broj ne smije biti manji od nule.");
        }
        int fakt = 1;
        for (int i = 1; i <= broj; i++) {
            fakt=i*fakt;
        }
        System.out.println(fakt);
    }
}
