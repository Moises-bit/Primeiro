public class Jogabilidade {

    public static void main(String[] args) {
    Jogadores[] jogadores = new Jogadores[4]; 

    jogadores[0] = new Jogadores("móvys", "frente", 98, 76);
    jogadores[1] = new Jogadores("Jamaica", "refragger", 68, 86);
    jogadores[2] = new Jogadores("zé", "suporte", 70, 70); 
    jogadores[3] = new Jogadores("Gui", "terceiro homem", 40, 50); 

    for(int i = 0; i<jogadores.length; i++){
        System.out.println("Jogador " + (i+1) + ": ");
        jogadores[i].quadro(); 
        System.out.println("");
    }

   
    } 
}
