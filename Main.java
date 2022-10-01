import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        System.out.println("введите число :");
        Scanner inputone = new Scanner(System.in);
        int input = inputone.nextInt();
        int input1 = inputone.nextInt();
        System.out.println(input + "+" + input1 + "=" + (input + input1) + "\n" + input + "-" + input1 + "=" + (input - input1) + "\n" + input1 + "-" + input + "=" + (input1 - input) + "\n" + input + "*" + input1 + "=" + (input * input1) + "\n" + input + ":" + input1 + "=" + (input / input1) + "\n" + input1 + ":" + input + "=" + (input1 / input)  );
    }
}
