import java.util.Locale;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu saldo !");
        float saldo = scanner.nextFloat();

        ContaTerminal conta = new ContaTerminal(numero,agencia,nome,saldo);

        System.out.println("Olá "+conta.nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+" e seu saldo R$"+conta.saldo+" já está disponível para saque");

        
    }
}
