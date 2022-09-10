import java.util.Scanner;

import javax.swing.text.html.FormSubmitEvent;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i+1); k++) {
                System.out.print("*");
            }
            if(i == n-1){
                System.out.println("");
                for (int l = n; l >= 0 ; l--) {
                    for (int m = (n-l); m > 0; m--) {
                        System.out.print(" ");
                    }
                    for (int p = (2*l+1); p >0; p--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            else{
                System.out.println("");
            }
        }
        sc.close();
    }            
}