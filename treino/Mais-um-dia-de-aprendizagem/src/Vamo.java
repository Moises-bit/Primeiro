

import java.util.Scanner;
public class Vamo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Cadastro eu = new Cadastro(); 

        System.out.println("Nome: ");
        String nomeEu = scanner.nextLine(); 
        eu.setNome(nomeEu); 

        System.out.println("Idade: ");
        int idadeEu = scanner.nextInt();
        scanner.nextLine();  
        eu.setIdade(idadeEu); 

        System.out.println("Cep: ");
        String cepEu = scanner.nextLine(); 
        eu.setCep(cepEu);
        
       
        System.out.println(eu.getCepLength());
    }
}
