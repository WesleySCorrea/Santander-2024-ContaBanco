import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        Integer numero = sc.nextInt();
        System.out.println("Agora digite o número da agência: ");
        String agencia = sc.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();
        System.out.println("Digite o saldo inicial: ");
        Double saldo = sc.nextDouble();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de %.2f já está disponível para saque.", saldo);
    }
}