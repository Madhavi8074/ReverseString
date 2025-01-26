import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String reversedStr="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reversedStr=ch+reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
        sc.close();
    }
    
}


