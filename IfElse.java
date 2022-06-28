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

        byte variable1 = 5;
        byte variable2 = 3;

        if (variable1 == variable2) {
            System.out.println("a = b");
        } else if (variable1 > variable2) {
            System.out.println("max = " + variable1 + ", min = " + variable2);
        } else {
           System.out.println("max = " + variable2 + ", min = " + variable1); 
        }

        System.out.println("");

        byte number = 5;

        if (number%2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        if (number > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }

        if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("not zero");
        }

        System.out.println("");

        int number1 = 123;
        int number2 = 321;

        if (number1 / 100 == number2 / 100) {
            System.out.println(number1 / 100);
        }

        if (number1 % 100 / 10 == number2 % 100 / 10) {
            System.out.println(number1 % 100 / 10);
        }

        if (number1 % 10 == number2 % 10) {
            System.out.println(number1 % 10);
        }

        System.out.println("");

        char symbol = '\u005A';
        int code = symbol;

        if (code >= 58 && code <= 57) {
            System.out.println("number");
        } else if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
            System.out.println("letter");
        } else {
            System.out.println("symbol");
        }

        System.out.println("");

        System.out.println("Determination of the deposit amount and accrued by the bank %");
        int deposit = 300_000;
        int percent = 0;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        System.out.println("Deposit amount: " + deposit);
        System.out.println("Accrued interest (" + percent + "): " + deposit * percent / 100);
        System.out.println("Total amount with interest: " + (deposit + deposit * percent / 100));

        System.out.println("");

        System.out.println("Determination of assessment by subjects");
        int percentHistory = 59;
        int percentProg = 91;
        int gradeHistory = 2;
        int gradeProg = 2;

        if (percentHistory > 60 && percentHistory <= 73) gradeHistory = 3;
        if (percentHistory >= 73 && percentHistory <= 91) gradeHistory = 4;
        if (percentHistory > 91) gradeHistory = 5;

        if (percentProg > 60 && percentProg <= 73) gradeProg = 3;
        if (percentProg >= 73 && percentProg <= 91) gradeProg = 4;
        if (percentProg > 91) gradeProg = 5;

        System.out.println("" + gradeHistory + " - history");
        System.out.println("" + gradeProg + " - programming");
        System.out.println("Average score: " + (gradeHistory + gradeProg) / 2);
        System.out.println("Average % by subject: " + (percentHistory + percentProg) / 2);

        System.out.println("");

        System.out.println("Profit calculation");
        int rent = 5000;
        int profit = 13000;
        int cost = 9000;
        int yearProfit = (profit - rent - cost) * 12;
        if (yearProfit > 0) {
            System.out.println("Profit for the year: +" + yearProfit);
        } else {
            System.out.println("Profit for the year: " + yearProfit);
        }

        System.out.println("");

        System.out.println("Counting the number of banknotes");
        int cash = 567;
        int availBanknote1 = 100_000; 
        int availBanknote10 = 5;
        int availBanknote100 = 50_000;
        int issueBanknote1;
        int issueBanknote10;
        int issueBanknote100;
        boolean insufficientBanknotes = false;

        issueBanknote100 = cash / 100;
        issueBanknote10 = cash % 100 / 10;
        issueBanknote1 = cash % 10;

        if (issueBanknote100 > availBanknote100) {
            issueBanknote10 += (issueBanknote100 - availBanknote100) * 10;
            issueBanknote100 = availBanknote100;
        }
        if (issueBanknote10 > availBanknote10) {
            issueBanknote1 += (issueBanknote10 - availBanknote10) * 10;
            issueBanknote10 = availBanknote10;
        }
        if (issueBanknote1 > availBanknote1) {
            insufficientBanknotes = true;
        }

        System.out.println("Requested amount: " + cash);
        if (!insufficientBanknotes) {
            int controlCash = issueBanknote100 * 100 + issueBanknote10 * 10 + issueBanknote1;
            if (controlCash == cash) {
                System.out.println("The correctness of the calculations has been verified");
            } else {
                System.out.println("Calculations contain an error");
            }
            System.out.println("banknotes with face value 100: " + issueBanknote100);
            System.out.println("banknotes with face value 10: " + issueBanknote10);
            System.out.println("banknotes with face value 1: " + issueBanknote1);
            System.out.println("initial amount:  " + controlCash);
        } else {
            System.out.println("There is no such amount in the ATM!");
    }
}