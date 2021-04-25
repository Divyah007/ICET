package icet.in;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i = 0;
do {
    System.out.println("Enter an IP address:");
    Scanner s=new Scanner(System.in);
    String si =s.next();


    if (si.matches("(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))")) {
        //valid
        i = 1;
    }
    else
    {
        System.out.println("Please enter a Valid IP address");
    }

    if (i == 1) {
        String[] a = new String[si.length()];
        a = si.split("\\.");
        for (int j = 0; j < a.length; j++) {
            int b = Integer.parseInt(a[j]);
            String v = Integer.toBinaryString(b);
            if (j == 3) {
                String p = String.format("%8s", v).replaceAll(" ", "0");
                System.out.print(p);
            } else {
                String p = String.format("%8s", v).replaceAll(" ", "0");
                System.out.print(p + ".");
            }
        }


    }
}while(i!=1);


    }
}
