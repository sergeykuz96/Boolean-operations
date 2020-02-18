public class Main {

    public static void booleanSum(int a, int b) {
        int c;
        if(( a == 0 || a==1) && (b==0 || b==1)){  //global condition
        if (a !=  b) {//condition for different a and b

            if (a == 1) {
                c = a + b;
                c = a;
                //      System.out.printf("%d + %d = %d \n ", a, b, c);
            }
            else
            if(b == 1) {
                c = b + a;
                c = b;
                //        System.out.printf("%d + %d = %d \n", b, a, c);
            }
        } else // condition for equal a and b
            c = a+a;
        c = a;
        System.out.printf("%d + %d = %d \n ",a, b, c );
        } else System.out.println("This is not boolean algebra. Coefficients must be 0 or 1");
    }

    public static void booleanMult(int a, int b) {
        int c;
        if(( a == 0 || a==1) && (b==0 || b==1)) {
            if (a != b) {
                if (a == 1) {
                    c = a * b;
                    c = b;
                    System.out.printf("%d * %d = %d \n ", a, b, c);
                } else if (b == 1) {
                    c = b * a;
                    c = a;
                    System.out.printf("%d * %d = %d \n", a, b, c);
                }
            } else if (a == b) {
                if (a == 1) {
                    c = a * a;
                    c = a;
                    System.out.printf("%d * %d = %d \n ", a, b, c);
                } else if (a == 0) {
                    c = a * a;
                    c = a;
                    System.out.printf("%d * %d = %d \n ", a, b, c);
                }
            }
        }
        else System.out.println("This is not boolean algebra. Coefficients must be 0 or 1");
    }

    public static void main(String[] args) {
        System.out.println("SUM");
       booleanSum(1,0);
       booleanSum(0,1);
       booleanSum(1,1);
       booleanSum(0,0);
        booleanSum(0,2);
        System.out.println("MULTIPLY");
        booleanMult(1,0);
        booleanMult(0,1);
        booleanMult(1,1);
        booleanMult(0,0);
        booleanMult(2,1);

    }
}
