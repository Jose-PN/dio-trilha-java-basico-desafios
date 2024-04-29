import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero conta que deseja acesso.");
        int conta = scanner.nextInt();

        System.out.println("Agora digite o número de sua agencia");
        String agencia = scanner.next();

        System.out.println("Informe aqui o seu Nome");
        String nome = scanner.next();

        System.out.println("Informe aqui o seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Informe o valor a ser depositado");
        double depositado = scanner.nextDouble();

        System.out.println("CC: " + conta);
        System.out.println("AG: " + agencia);
        System.err.println("Olá Sr. " + nome + " " + sobrenome);
        System.out.println("Seu saldo é: " + depositado);

    }
}
