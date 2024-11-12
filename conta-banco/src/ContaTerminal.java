import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da sua agência!");
            String agencia = scanner.next();

            System.out.println("Digite o número da sua conta:");
            int conta = scanner.nextInt();

            System.out.println("Qual o seu nome?");
            String nome = scanner.next();
            String sobrenome = scanner.next();


            System.out.println("O seu saldo é?");
            float saldo = scanner.nextFloat();

            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco! " );
            System.out.println("Sua agência é: " + agencia + " conta: " + conta + " e o seu saldo: " + saldo + " ja está disponível para saque.");

        }
    }
}
