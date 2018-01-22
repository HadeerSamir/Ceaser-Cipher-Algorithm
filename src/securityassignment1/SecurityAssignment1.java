package securityassignment1;

import java.util.Scanner;

public class SecurityAssignment1 {
   
    
    public static void main(String[] args) {

 
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        String plain = scan.next();
       
        
        String cipher=caesarCipher(plain,key);
        System.out.println(cipher);
      

    }

    public static String caesarCipher(String plainText, int key) {

        String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] cipher = plainText.toCharArray();

        if (key<=0 || key>25) {
            
            return "";
            
        }
        else {

            for (int i = 0; i < plainText.length(); i++) {
                
                int positionOfChar=letters.indexOf(plainText.charAt(i));
                cipher[i] = letters.charAt((positionOfChar+key)%26);
                
            }
            String newCipher="";
            
            for(int j=0;j<cipher.length;j++){
                newCipher+=cipher[j];
            }
            return newCipher;
            
        }

    }

}
