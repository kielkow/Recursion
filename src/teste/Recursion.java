package collegetasks;

public class CollegeTasks {

    public static void main(String[] args) {
        //soma(500);
        //regressiva(15);
        //fibonacciInt(34);
        System.out.println(pow(4,2));
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

    public static void fibonacciInt(int n) {
        int x = 0;
        int y = 1;
        int res = 0;

        for (int i = 0; res <= n; i++) {
            System.out.println(res);
            res = x;
            x = y;
            y = res + y;
        }
    }

    public static int fibonacciRec(int n) {
        if(n == 0){
            return n;
        }
        else{
            
        }
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
