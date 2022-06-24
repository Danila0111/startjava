public class IfElse  {   
    public static void main(String[] args) {
        
        int age = 21;
        boolean man = true;
        double growth = 1.85;
        String name = "Danila";


        if (age > 20) {
            System.out.println("Age over 20");
        }

        if (!man) {
            System.out.println("female");
        }

        if (growth < 1.80) {
            System.out.println("Height less than 1.80");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("first Letter Of Name М");            
        } else if (firstLetterOfName == 'M') {
            System.out.println("first Letter Of Name I");    
        } else {
            System.out.println("the first letter of the name is not I or M");
        }

        System.out.println("");

        byte a2 = 5;
        byte b2 = 3;

        if (a2 == b2) {
            System.out.println("a = b");
        } else if (a2 > b2) {
            System.out.println("max = " + a2 + ", min = " + b2);
        } else {
           System.out.println("max = " + b2 + ", min = " + a2); 
        }

        System.out.println("");

        byte a3 = 5;

        if (a3%2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        if (a3 > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }

        if (a3 == 0) {
            System.out.println("zero");
        } else {
            System.out.println("not zero");
        }

        System.out.println("");

        int a4 = 123;
        int b4 = 321;

        if (a4 / 100 == b4 / 100) {
            System.out.println(a4 / 100);
        }

        if (a4%100 / 10 == b4%100 / 10) {
            System.out.println(a4%100 / 10);
        }

        if (a4%10 == b4%10) {
            System.out.println(a4%10);
        }

        System.out.println("");

        char c5 = '\u005A';
        int i5 = c5;

        if (i5 >= 58 && i5 <= 57) {
            System.out.println("number");
        } else if ((i5 >= 65 && i5 <= 90) || (i5 >= 97 && i5 <= 122) {
            System.out.println("letter");
        } else {
            System.out.println("sumbol");
        }

        System.out.println("");
    }
}