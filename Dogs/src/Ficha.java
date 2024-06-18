public class Ficha {
    String nome;
    double idade;
    boolean medicacao = false; 
    boolean saude = false; 
    
    public void medicar(){
        if(saude == false && medicacao == false){
            System.out.println("Medicando...");
            saude = true;
            medicacao = true;
        }
        else if(saude == false && medicacao == true){
            System.out.println("Ele foi medicado há pouco tempo");
            saude = true; 
        }
        else if(saude == true && medicacao == false) {
            System.out.println("Ele está bem e não precisa de medicação.");
        }
    }

    public void passear(){
        if(saude == true && medicacao == false){
            System.out.println("Passeando");
        }
        else if (saude == true && medicacao == true){
            System.out.println("Ele está medicado, entao precisa descansar.");
        }
        else if (saude == false && medicacao == false){
            System.out.println("Ele precisa ser medicado e se recompor.");
        }
        else if(saude = false && medicacao == true){
            System.out.println("Ele precisa descansar, pois está medicado.");
        }
    }

    public void descansar(){
        if(medicacao == true){
            System.out.println("Descansando");
            medicacao = false;
        }
        else{
            System.out.println("Ele já está pronto para passear.");
        }
    }
}
