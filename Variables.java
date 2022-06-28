public class Variables {   
    public static void main(String[] args) {
        byte hhd = 2;
        short seria = 42;
        int soket = 1155;
        long register = 124124L;
        float proc = 12.345949f;
        double capacity = 4323.45345;
        char model = 'Z';
        boolean ssd = true;

        System.out.println(hhd);
        System.out.println(seria);
        System.out.println(model);
        System.out.println(soket);
        System.out.println(proc);
        System.out.println(register);
        System.out.println(capacity);
        System.out.println(ssd);

        int product_x = 100;
        int product_y = 200;
        int sum = product_x + product_y;
        float sum2 = sum * 89 / 100;
        float sale = sum - sum * 89 / 100;

        System.out.println("");
        System.out.println("Сумма товаров со скидкой: " + sum2);
        System.out.println("Сумма скидки: " + sale);

        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        byte integers1 = 127;
        short integers2 = 32_767;
        int integers3 = 2_147_483_647;
        long integers4 = 2^63-1;
        float integers5 = 3.402823466e+38f;
        double integers6 = 1.7976931348623158e+308;

        float integers5_1 = 3.402823466e+38f;
        float integers5_2 = 3.402823466e+37f;
        System.out.println(integers5_1);
        System.out.println(integers5_2);

        float integers5_3 = integers5_2;
        integers5_2 = integers5_1;
        integers5_1 = integers5_3;
        System.out.println(integers5_1);
        System.out.println(integers5_2);
        System.out.println("");

        int variable1 = 35; 
        int variable2 = 38; 
        int variable3 = 64; 
        int variable4 = 94; 
        int variable5 = 95;

        System.out.println(variable1 + " = " + (char)variable1);
        System.out.println(variable2 + " = " +(char)variable2);
        System.out.println(variable3 + " = " +(char)variable3);
        System.out.println(variable4 + " = " +(char)variable4);
        System.out.println(variable5 + " = " +(char)variable5);
        System.out.println("");

        int number = 345;
        int hundreds = number / 100;
        int dozens = number % 100 / 10;
        int units = number % 10;

        System.out.println(number);
        System.out.println(hundreds);
        System.out.println(dozens);
        System.out.println(units);
        System.out.println(hundreds*dozens*units);
        System.out.println(hundreds+dozens+units);
        System.out.println("");

        char space = ' ';
        char cl = '/';
        char cr = '\\';
        char brl = '(';
        char brr = ')';
        char down = '_';


       // System.out.println(space + space + space + space + space + cl + cr + space + space + space + space + space + space);
       // System.out.println(space + space + space + cl + space + space + space + cr + space + space + space + space + space);
       // System.out.println(space + space + down + brl + space + brr + cr + space + space + space + space + space + space);
      //  System.out.println(space + cl + space + space + space + space + space + space + cr + space + space + space + space);
       // System.out.println(cl + down + down + down + down + cl + cr + down + down + cr + space + space + space);
         //System.out.println(cl + down + "");

        int number2 = 123;
        int hundreds2 = number2 / 100;
        int dozens2 = number2 % 100 / 10;
        int units2 = number2 % 10;
        System.out.println(number2);
        System.out.println(hundreds2);
        System.out.println(dozens2);
        System.out.println(units2);

        long seconds = 86399;
        long hour = seconds / 3600;
        seconds = seconds - hour * 3600;
        long min = seconds / 60;
        seconds = seconds - min * 60;
        System.out.println(hour + ":" + min + ":" + seconds);
        System.out.println("");
    }
}