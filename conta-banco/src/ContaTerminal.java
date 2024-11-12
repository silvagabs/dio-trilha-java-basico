import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da agência!");
            String agencia = scanner.next();

            System.out.println("Digite o número da sua conta:");
            int conta = scanner.nextInt();

            System.out.println("Qual o seu nome?");
            String nome = scanner.next();

            System.out.println("O seu saldo é?");
            double saldo = scanner.nextDouble();

            System.out.println("Olá," + (nome) + "obrigado por criar uma conta em nosso banco," );
            System.out.println("Sua agência é" + (agencia) + "conta" + (conta) + "e o seu saldo" + (saldo) + "ja está disponevel para saque.");


        
        }
    }
}
