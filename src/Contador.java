import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
        try {
			//chamando o método contendo a lógica de contagem
		    contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {	
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();            
        }else if (parametroUm==parametroDois) {
            System.err.println("Os parâmetros não podem ser iguais. O segundo parâmetro deve ser maior que o primeiro");
        }
		int contagem = parametroDois - parametroUm;
        System.err.println("\nSerão "+contagem+ " ocorrências");
        for (int numeroUm = parametroUm; numeroUm < parametroDois; numeroUm++) {
            System.err.println("Imprimindo o numero: " +numeroUm);
        }
        
	}
}
