public class Variables {   
    public static void main(String[] args) {
        
        byte b = -5;
        short s = 42;
        int i = 12_245;
        long ln = 1_245_334_544;
        float f = 3.141_592f;
        double d = 3.145_592_653;
        char c = 'Z';
        boolean bo = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(ln);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bo);

        int x = 100;
        int y = 200;
        int sum = x+y;
        float sum2 = sum*89/100;
        float sale = sum - sum*89/100;

        System.out.println("");
        System.out.println("Сумма товаров со скидкой: " + sum2);
        System.out.println("Сумма скидки: " + sale);

        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        byte b1 = 127;
        short s1 = 32_767;
        int i1 = 2_147_483_647;
        long ln1 = 2^63-1;
        float f1 = 3.402823466e+38f;
        double d1 = 1.7976931348623158e+308;

        float f2 = 3.402823466e+38f;
        float f3 = 3.402823466e+37f;
        System.out.println(f2);
        System.out.println(f3);

        float f4 = f3;
        f3 = f2;
        f2 = f4;
        System.out.println(f2);
        System.out.println(f3);  
        System.out.println("");

        int i61 = 35; 
        int i62 = 38; 
        int i63 = 64; 
        int i64 = 94; 
        int i65 = 95;

        System.out.println(i61 + " = " + (char)i61);
        System.out.println(i62 + " = " +(char)i62);
        System.out.println(i63 + " = " +(char)i63);
        System.out.println(i64 + " = " +(char)i64);
        System.out.println(i65 + " = " +(char)i65);
        System.out.println("");

        int i7 = 345;
        int i71 = i7/100;
        int i72 = i7%100/10;
        int i73 = i7%10;

        System.out.println(i7);
        System.out.println(i71);
        System.out.println(i72);
        System.out.println(i73);
        System.out.println(i71*i72*i73);
        System.out.println(i71+i72+i73);
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

        int i9 = 123;
        int i91 = i9/100;
        int i92 = i9%100/10;
        int i93 = i9%10;
        System.out.println(i9);
        System.out.println(i91);
        System.out.println(i92);
        System.out.println(i93);

        long l10 = 86399;
        long hour = l10/3600;
        l10 = l10 - hour*3600;
        long min = l10/60;
        l10 = l10 - min*60;
        System.out.println(hour + ":" + min + ":" + l10);
        System.out.println("");
    }
}