import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int s1,s2,s3;
	    System.out.print("1.Sayı : ");
	    s1 = input.nextInt();
        System.out.print("2.Sayı : ");
        s2 = input.nextInt();
        System.out.print("3.Sayı : ");
        s3 = input.nextInt();

        boolean kucukmu = (s1 < s2 && s1 < s3);
        if (kucukmu==true){
            kucukmu = (s2 < s3);
            if (kucukmu==true){
                System.out.print(s1 + " " + s2 + " " + s3);
            }
            else {
                System.out.print(s1 + " " + s3 + " " + s2);
            }
        }

        kucukmu = (s2 < s1 && s2 < s3);
        if (kucukmu==true){
            kucukmu = (s1 < s3);
            if (kucukmu==true){
                System.out.print(s2 + " " + s1 + " " + s3);
            }
            else {
                System.out.print(s2 + " " + s3 + " " + s1);
            }
        }

        kucukmu = (s3 < s1 && s3 < s2);
        if (kucukmu==true){
            kucukmu = (s3 < s1);
            if (kucukmu==true){
                System.out.print(s3 + " " + s1 + " " + s2);
            }
            else {
                System.out.print(s3 + " " + s2 + " " + s1);
            }
        }
    }
}
