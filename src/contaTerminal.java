import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("informe seu nome!");
    String nome = scanner.nextLine();

    if(nome.matches("a-zA-Z+")){


        System.out.println("informe o número da sua agencia !");
        int agencia = scanner.nextInt();
   
       System.out.println("informe seu saldo atual ");
       double saldo = scanner.nextDouble();
   
       System.out.println("informe seu número!");
       int Numero = scanner.nextInt();
   
   
       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + Numero + " e seu saldo " + saldo +" já está disponível para saque");


    }else{
        System.out.println("Por favor, insira apenas letras para o nome.");
    }

    scanner.close();
    }
}
