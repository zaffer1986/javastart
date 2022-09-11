/**
 *Java basic: HomeWork2
 *
 @author Muzaffar Eshonqulov
 @todo 11.9.2022(working on tasks =10hour)
 @date 11.9.2022
 *
*/
class HomeWork2 {
    public static void main (String[] args) {
        //Level 1
        //task1
        System.out.println(checkWeather(-15, 0));
        System.out.println(checkWeather(0, 18));
        System.out.println(checkWeather(19, 29));
        System.out.println(checkWeather(29, 35));
        
        //task2-variant1
        boolean isWeekend = true;
        boolean isRain = false;
        if (isWeekend && isRain) {
            System.out.println("I can Walk");
        } else {
            System.out.println("I cannot walk");
        }
        
        //task2-variant2
            System.out.println(canWalk(true, false));

        //task3
        int c = add(6, 8);
        System.out.println(c);
        System.out.println(minus (11, 8));
        int d = multiply(15, 2);
        System.out.println(d);
        System.out.println(divide(6, 3));
    }
    
         // METHODS

        //task1
    static int checkWeather(int t, int t1) {
        if (t == -15 && t1 == 0) {
            System.out.println("It's frost");
            return t;
        } else if( t == 0 && t1 == 18) {
            System.out.println("It's  cold");
            return t1;
        } else if ( t == 19 && t1== 29) {
            System.out.println("It's  warm");
            return t1;
        } else if (t == 29 && t1 == 35) {
            System.out.println("It's  hot");
            return t1;
        } else {
            System.out.println("Error weather");
            return t;
        }
    }

        //task2-variant2
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        if (isWeekend && isRain) {
            System.out.println("i can walk");
            return true;
        } else {
            System.out.println("i cannot walk");
            return false;
        }
    }
        //task3
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }
    static int minus(int a, int b) {
        int c = a - b;
        return c;
    }
    static int multiply(int a, int b) {
        int d = a * b;
        return d;
    }
    static int divide(int a, int b) {
        int c = a / b;
        return c;
    }
}
