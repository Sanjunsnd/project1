import java.util.*; // Scanner ko run karne ke liye हम इस कमांड को इम्पोर्ट करते हैं

public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // input value dene ke liye हम System.in command ka use karte hai ( Scanner object banane ke kaam aata hai)

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a == b){
//            System.out.println("A बराबर है B के ");
//        }
//        else{
//            if(a > b){
//                System.out.println("A is greater");
//            } else {
//                System.out.println("A is lesser");
//            }
//           System.out.println("A is not equal to B");
//        }
//        int x = sc.nextInt();
//        int even;
//
//        if( x % 2 == 0) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        int button = sc.nextInt();
//
//        if(button == 1) // बटन का प्रयोग हम किसी बटन के द्वारा दी गयी कमांड प्रिंट करने के लिए करते है
//        {
//            System.out.println("Hello! Sanju में आपकी क्या सेवा कर सकती हूँ ");
//        } else if(button == 2) {
//            System.out.println("Namaste");
//        } else if(button == 3) {
//            System.out.println("Bonjour");
//        } else {
//            System.out.println("Invalid Button");
//        }
//        int button = sc.nextInt();
//        switch(button) {
//            case 1 : System.out.println("Hello! Mr. Sanju Baghel. May I help you?");
//            break;
//            case 2 : System.out.println("Namaste! May I help you?");
//            break;
//            case 3 : System.out.println("shubh prabhat! mere priy bhai/mitra");
//            break;
//            default : System.out.println("Invalid Button");
//
//        }
        int button = sc.nextInt();
        switch(button) {
            case 1 :System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("Invalid Number");

        }


    }
}
