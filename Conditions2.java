import java.util.*; // Scanner ko run karne ke liye हम इस कमांड को इम्पोर्ट करते हैं

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // input value dene ke liye हम System.in command ka use karte hai ( Scanner object banane ke kaam aata hai)
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }

    }
}
