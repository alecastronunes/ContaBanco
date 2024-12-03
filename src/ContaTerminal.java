import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência
        // é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para
        // saque".

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;

        String resultado = "Olá ".concat(nomeCliente)
                .concat(", ")
                .concat("obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(" ")
                .concat("conta ");

        System.out.println(resultado + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
