package listaExercicios.automovel.moto;

public class MotoPartidaPedal extends Moto{
	
    private boolean acelerador;
    
    public MotoPartidaPedal() {
    	super();
    }
    
    public MotoPartidaPedal(boolean acelerador) {
    	super();
    	this.acelerador = acelerador;
    }
    
    public void ligar(boolean acelerador){
    	if(acelerador == true) {
    		this.acelerador = acelerador;
    	}
    }
}
