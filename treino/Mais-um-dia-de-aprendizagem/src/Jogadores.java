public class Jogadores {
    private String nome;
    private String funcao; 
    private int nivelAgressividade; 
    private int nivelEstrategia; 

    public Jogadores(String nome, String funcao, int agress, int estrategia){
        this.nome = nome;
        this.funcao = funcao;
        this.nivelAgressividade = agress;
        this.nivelEstrategia = estrategia;       
}
    public void quadro(){
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Agressividade: " + nivelAgressividade);
        System.out.println("Estratégia: " + nivelEstrategia);
    }
    
}
