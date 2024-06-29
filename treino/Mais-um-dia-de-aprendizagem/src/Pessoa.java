public class Pessoa {
    private String nome; 
    private int idade;
    boolean estudo = false; 

public Pessoa(String nome, int idade, boolean estudo){
    this.nome = nome;
    this.idade = idade;
    this.estudo = estudo;
}

public String getNome(){
    return nome; 
}
public int getIdade(){
    return idade; 
}
public void setNome(String nome){
    this.nome = nome; 
}
public void setIdade(int idade){
    this.idade = idade; 
}
public void informarPerfil(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Quadro de estudo: " + estudo);
}
public void estudar(){
    if(estudo == false){
        System.out.println("Estudando...");
        estudo = true; 
    }
}
public void jogar(){
    if(estudo == true)
        System.out.println("Jogando...");
    else
        System.out.println("Você ainda precisa estudar."); 
}
    
}
