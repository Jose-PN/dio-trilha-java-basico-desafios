import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta que deseja acesso.");
        int conta = scanner.nextInt();

        System.out.println("Agora digite sua agência.");
        String agencia = scanner.next();

        System.out.println("Informe aqui seu nome.");
        String nome = scanner.next();

        System.out.println("Informe aqui seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Digite o valor que deseja realizar deposito.");
        double deposito = scanner.nextDouble();

        System.out.println("Olá Sr. " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua conta é: " + conta + ", e sua agencia é: " + agencia);
        System.out.println("Seu saldo é, R$" + deposito + ", e está disponivel para saque");
    }
}