public class Main {
    public static void main(String[] args) {
        System.out.println(printNumberInWord(0));
        System.out.println(printNumberInWord(1));
        System.out.println(printNumberInWord(2));
        System.out.println(printNumberInWord(3));
        System.out.println(printNumberInWord(4));
        System.out.println(printNumberInWord(5));
        System.out.println(printNumberInWord(6));
        System.out.println(printNumberInWord(7));
        System.out.println(printNumberInWord(8));
        System.out.println(printNumberInWord(9));
        System.out.println(printNumberInWord(10));
        System.out.println(printNumberInWord(-1));

    }

    public static int printNumberInWord(int number){
        switch(number){
            case 0: System.out.println("ZERO");
            break;
            case 1: System.out.println("ONE");
            break;
            case 2: System.out.println("TWO");
            break;
            case 3: System.out.println("Three");
            break;
            case 4: System.out.println("Four");
            break;
            case 5: System.out.println("FIVE");
            break;
            case 6: System.out.println("SIX");
            break;
            case 7: System.out.println("SEVEN");
            break;
            case 8: System.out.println("EIGHT");
            break;
            case 9: System.out.println("NINE");
            break;
            default:
                System.out.println("OTHER");
                break;
        }
        return 0;
    }
}
