import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da agência com dígito:");
        String agencia = scanner.next();

        System.out.println("Digite o seu primeiro nome:");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println(
                "Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}