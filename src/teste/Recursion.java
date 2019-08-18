package collegetasks;

public class CollegeTasks {

    public static void main(String[] args) {
        //soma(500);
        //regressiva(15);
        
        //System.out.println(fibonacciInt(12));
        //mostraSequenciafibonacciInt(12);
        
        //System.out.println("-------------");
        
        //System.out.println(fibonacciRec(12));
        //System.out.println(mostraSequenciafibonacciRec(12));

        //System.out.println(pow(5,5));
    }

    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println(n);
            return (n + soma(n - 1));
        }
    }

    public static int regressiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return (n - regressiva(n - 1));
        }
    }

    public static int fibonacciInt(int n) {
        int x = 0;
        int y = 1;
        int res = 0;

        for (int i = 0; i <= n; i++) {
            res = x;
            x = y;
            y = res + y;
        }
        return res;
    }

    public static void mostraSequenciafibonacciInt(int n) {
        int x = 0;
        int y = 1;
        int res = 0;

        for (int i = 0; i < n; i++) {
            res = x;
            x = y;
            y = res + y;
            System.out.println(res);
        }
    }

    public static int fibonacciRec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }

    public static int mostraSequenciafibonacciRec(int n) {

        if (n == 0) {
            return 0;
        }

        int x = 0;
        int y = 1;
        int res = 0;

        for (int i = 0; i < n; i++) {
            res = x;
            x = y;
            y = res + y;
        }
        if (res > 0) {
            System.out.println(res);
        }
        return mostraSequenciafibonacciRec(n - 1);
    }

    public static int pow(int n, int m) {
        if(m == 0){
            return 1;
        }
        else{
            return (n * pow(n, m - 1));
        }
    }
}
