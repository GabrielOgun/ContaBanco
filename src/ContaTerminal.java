
import java.util.*;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Porfavor Digite o Numero da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Porfavor Digite o Numero da Agencia!");
        String agencia = scanner.next();

        System.out.println("Porfavor Digite o seu Nome");
        scanner.nextLine();
        String nome = scanner.nextLine();

        
        System.out.println("Porfavor Digite o Saldo");
        double saldo = scanner.nextDouble();

      

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta 787" + conta + "e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();

        






        










        System.out.println("Hello, World!");






    }
}
