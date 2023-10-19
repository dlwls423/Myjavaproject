import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input0 = sc.nextLine();
        float input1 = sc.nextFloat();
        int int_input1 = (int)input1;
        float percent = int_input1/5.0f * 100;
        sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();
        String input11 = sc.nextLine();


        System.out.println("[ " + input0 + " ]");
        System.out.println("별점 : "+ int_input1 + " (" + percent +"%)");
        System.out.println("1. " + input2);
        System.out.println("2. " + input3);
        System.out.println("3. " + input4);
        System.out.println("4. " + input5);
        System.out.println("5. " + input6);
        System.out.println("6. " + input7);
        System.out.println("7. " + input8);
        System.out.println("8. " + input9);
        System.out.println("9. " + input10);
        System.out.println("10. " + input11);
    }
}