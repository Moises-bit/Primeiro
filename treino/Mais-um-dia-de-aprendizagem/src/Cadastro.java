

public class Cadastro {
    private String nome;
    private String cep;
    private int idade; 

    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getNome(){
        return nome; 
    }

    public void setIdade(int idade){
        this.idade = idade; 
    }

    public int getIdade(){
        return idade; 
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return cep;
    }
    
    public String getCepLength(){
        return (cep != null && cep.length() == 11) ? "Cep validado com sucesso" : "Tente novamente";
    }

   
    
    
    

}
