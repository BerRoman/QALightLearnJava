package libs;

public class Libs {
    public static void sum(int slog1, int slog2) {
        int tempres = slog1 + slog2;
        System.out.println("result from method = " + tempres);
    }

//    "345" -> 345
//    "34a5" -> 34

    public static int sum( String var1, int var2) {
        try {
            int tempresult = var2 + Integer.parseInt(var1);
            System.out.println("result string + int = " + tempresult);
            return tempresult;
        } catch (NumberFormatException e) {
            System.out.println("error " + e);
            return 88888;
        } catch (Exception e) {
            System.out.println("error " + e);
            return 99999;
        }
    }


    public int mult(int mn1, int mn2) {
        int res = mn1 * mn2;
        System.out.println("Result from method mn = " + res);
        return res;
    }


}


