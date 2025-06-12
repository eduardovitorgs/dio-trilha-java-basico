import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor, digite o seu Nome!");
            String nomeCliente = sc.nextLine();
            
            System.out.println("Por favor, digite o número da Conta!");
            int numeroConta = sc.nextInt();
            
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = sc.next();
            
            // Saldo inicial
            float saldo = 0.0F;
            
            // Exibir a mensagem da conta criada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}
