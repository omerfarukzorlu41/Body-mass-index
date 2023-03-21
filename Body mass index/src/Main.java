import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double weihht,height,bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your Weight(kg) = ");
        weihht = scanner.nextDouble();
        System.out.print("Please enter your Height(in meters) = ");
        height = scanner.nextDouble();
        bmi = weihht/(height*height);
        System.out.print("Body mass index = "+bmi);
    }
}
