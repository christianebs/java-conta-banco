import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da Agência.");
        agencia = entradaString.nextLine();

        System.out.println("Por favor, digite o número da Conta.");
        numero = entrada.nextInt();

        System.out.println("Por favor, digite o Nome do Cliente.");
        nomeCliente = entradaString.nextLine();

        System.out.println("Por favor, digite o saldo da conta.");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
