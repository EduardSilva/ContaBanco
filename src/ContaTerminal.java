import java.util.Scanner;
import java.util.Locale;
/**
 * ContaTerminal
 */
public class ContaTerminal {



    public static void main(String[] args) {

        int numero;
        String agencia;
        String nome_cliente;
        double saldo; 

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá seja bem vindo. Vamos começar seu cadastro!\nDigite Seu nome:");
        nome_cliente = scan.nextLine();
        
        System.out.println("Digite sua agência:");
        agencia = scan.next();
        
        System.out.println("Digite o numero de sua conta:");
        numero = scan.nextInt();

        System.out.println("Digite o Saldo de sua conta:");
        saldo = scan.nextDouble();

        System.out.printf("Olá Seja bem vindo %s\nda agência nº:%s\nConta numero:%d\nCom saldo:%.2f\n", nome_cliente, agencia, numero, saldo );
        scan.close();

    }

    

}