import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");// Asking user for input

        int num = sc.nextInt(), reversed = 0; //We need three int spaces to solve

        for(;num != 0; num /= 10) { //for lopp will stop well num zero till then we can divide it
            int digit = num % 10;// we will get last number from the remainder and after loop we will keep pushing it to front by reversed*10
            reversed = reversed * 10 + digit;
        }

        System.out.println(reversed);
    }
}
