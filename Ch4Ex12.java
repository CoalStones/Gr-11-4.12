package ch4ex12;
import java.util.Scanner;
import java.text.NumberFormat;

public class Ch4Ex12 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int design,code,test,debug;
        double total;
        
        System.out.println("How much time did you spend on Designing?");
            design=input.nextInt();
        System.out.println("How much time did you spend on Coding?");
            code=input.nextInt();
        System.out.println("How much time did you spend on Testing?");
            test=input.nextInt();
        System.out.println("How much time did you spend on Debugging?");
            debug=input.nextInt();
        input.close();
            
        NumberFormat percent=NumberFormat.getPercentInstance();
        
        total=design+code+test+debug;
        
        System.out.format("%-8s %-7s\n","Category","% of Time");
        System.out.format("%-8s %-7s\n","Design: ",percent.format(design/total));
        System.out.format("%-8s %-7s\n","Code: ",percent.format(code/total));
        System.out.format("%-8s %-7s\n","Test: ",percent.format(test/total));
        System.out.format("%-8s %-7s\n","Debug: ",percent.format(debug/total));
        
    }
    
}
