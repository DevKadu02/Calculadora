
package calculadoramediaaluno;
import java.util.Scanner;
/**
 *
 * @author kadu
 */
public class CalculadoraMediaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        float media = 0;
        float result = 0;
        
        System.out.println("Calculadora de aluno:     ");
        System.out.print("Digite nota da A1:    ");
        n1 = sc.nextFloat();
        System.out.print("Digite nota da A2:    ");
        n2 = sc.nextFloat();
        System.out.print("Digite nota da A3:    ");
        n3 = sc.nextFloat();
        result = n1 + n2 + n3;
        media = result / 3;
        
        System.out.print("A media do aluno é:   " + (media));
        
        
    }
    
}
