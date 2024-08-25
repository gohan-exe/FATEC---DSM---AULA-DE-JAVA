
public class Computador {
    String proc;
    String mem;
    String ssd;
    boolean ligado;
    
    void ligar () {
    	
    	if (proc != null && mem != null && ssd != null){
            System.out.println("Ligando...");
            ligado = true;
    }
    else {
        System.out.println("piii pii pii");

    }
    
}
    String desligar() {
    	if(ligado==true) {
    		ligado = false;
    		return "Desligando.. Desligando!";
    	}
    		
    	
    	else {
    		return "Não está ligando!";
    	}
    }
  }
