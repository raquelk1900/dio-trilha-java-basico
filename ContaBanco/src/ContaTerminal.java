import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Exibir e obter os valores digitados pelo terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência!");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomecliente = scanner.next();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá " + nomecliente + ",");
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "); 
        System.out.println("conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
