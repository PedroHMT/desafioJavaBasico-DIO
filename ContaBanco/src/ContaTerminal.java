import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;
        System.out.println("Por favor, digite o número da Agência !");
        agencia = r.nextLine();
        System.out.println("Por favor, digite o número de sua Conta !");
        numero = r.nextInt(); r.nextLine();
        System.out.println("Por favor, digite o seu Nome !");
        nomeCliente = r.nextLine();
        System.out.println("Por favor, digite o seu Saldo !");
        saldo = r.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
