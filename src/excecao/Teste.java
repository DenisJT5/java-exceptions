package excecao;

/**
 *
 * @author Denis
 */
public class Teste {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(n + " = " + (char)n + "   ");
                n++;
            }
             System.out.print("\n");
        }
    }
}
