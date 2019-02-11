import libs.Libs;

import static libs.Libs.sum;

public class MainClass {
    public static void main(String arg[]) {
        System.out.println("Hello World!");
        int var1;
        int var2 = 10;
        Integer var33 = var2;
        //var2 = 11;
        System.out.println(var33);


        int rez;
        var1 = 5;
//        rez = var1 + var2;
//        System.out.println("Result = " + rez);
        sum(var1, var2);

        int var3 = 45;
//        int rez1 = var2 + var3;
//        System.out.println("Result 1 = " + rez1);
        sum(var2, var3);

       // int rez_3 = sum (String, int)
        String result = "test" + 4 ;
        int test1 = sum("3456" , 5) + 555;
//        sum (555,"12");
        System.out.println(sum("34a5" , 5));

        System.out.println("---End---");


        Libs objectLibs;
        objectLibs = new Libs();

        objectLibs.mult(5,6);
        objectLibs.mult(68,89);


        int[] month = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println("Array elemnt 2 = " + month[1]);
        System.out.println("Array elemnt 3 = " + month[2]);

        int[] month2 = new int[12];


//        month2[0] = 1;
//        month2[1] = 2;
//        month2[2] = 3;

        for (int i = 0; i < month2.length; i++) {
            month2[i] = i + 1;

        }


    }






}
