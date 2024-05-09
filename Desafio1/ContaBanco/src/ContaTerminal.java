//TODO: Conhecer e importar a classe Scanner
//Link de ajuda: https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
//https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe


//Exibir as mensagens para o usuário

//Obter pela classe Scanner os valores digitados no terminal

//Exibir a mensagem final - da conta criada

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente!");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");        
        float saldo = scanner.nextFloat();


        System.out.println("Olá " + cliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
