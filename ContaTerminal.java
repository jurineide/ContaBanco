import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    public static void main(String[] args) {
        
       
        Scanner leitura= new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = leitura.nextLine();


        System.out.println("Digite sua agência ");
        String agencia = leitura.nextLine();

        System.out.println("Digite o numero da sua conta ");
        int numero = leitura.nextInt();

        System.out.println("Digite o valor depositado ");
        int valor = leitura.nextInt();        


        System.out.println("Olá " +nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero+", . O seu saldo já está disponível para saque, no valor de " + valor);
    }
        
}