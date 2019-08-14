package teste;

public class Recursion {

    public static void main(String[] args) {
        soma(500);
        
        regressiva(15);   
    }

    
    public static int soma(int n) {
        if (n == 1) {
            return 1;
        }
        else{
            System.out.println(n);
            return (n + soma(n -1));
        }
    }
    
    public static int regressiva(int n){
        if(n == 0) {
            return 0;
        }
        else{
            System.out.println(n);
            return (n - regressiva(n -1));
        }
    }
}
