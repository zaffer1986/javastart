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
        System.out.println(checkWeather(-15));
        System.out.println(checkWeather(18));
        System.out.println(checkWeather(28));
        System.out.println(checkWeather(29));
        
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
        System.out.println(divide(5, 3));
        
        
        //Level 2
        
        //task1(d)
         int day = 3;
        String dayOfWeek;
        switch(day){
        case 1: dayOfWeek = "Monday";
            break;
        case 2: dayOfWeek = "Tuesday";
            break;
        case 3: dayOfWeek = "Wednesday";
            break;
        case 4: dayOfWeek = "Thursday";
            break;
        case 5: dayOfWeek = "Friday";
            break;
        case 6: dayOfWeek = "Saturday";
            break;
        case 7: dayOfWeek = "Sunday";
            break;
        default: dayOfWeek = "error";
            break;
        }
        System.out.println(dayOfWeek);

        //task2 (e)
        System.out.println(canBuyFood(true, false));

        //task 3 (f)
        double  a = 1;
        double  b = 6;
        double  z = 6;
        double  x1 = 0;
        double  x2 = 0;
        x1 = (- b + Math.sqrt(b * b - 4 * a * z))/(2 * a);
            System.out.println(x1);
    }

        //METHODS

        //task1
    static int checkWeather(int t) {
        if (t == -15 ) {
            System.out.println("It's frost");
            return t;
        } else if( t == 18) {
            System.out.println("It's  cold");
            return t;
        } else if ( t == 28) {
            System.out.println("It's  warm");
            return t;
        } else if (t == 29) {
            System.out.println("It's  hot");
            return t;
        } else {
            System.out.println("Error weather");
            return t;
        }
    }

        //task2-variant2
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        if (isWeekend) {
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
    static float divide(int a, int b) {
        int c = a / b;
        return c;
    }
       //Level 2
       // task2(e)
    static boolean canBuyFood(boolean isLidlOpen,boolean isTescoOpen) {
        if (isLidlOpen) {
            System.out.println("i can buy food in Tesco");
            return true;
        } else {
            System.out.println("i cannot buy food");
            return false;
        }
    }
}
