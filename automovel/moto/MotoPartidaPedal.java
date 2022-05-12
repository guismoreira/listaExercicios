package listaExercicios.automovel.moto;

public class MotoPartidaPedal extends Moto{
	
    private boolean acelerador;
    
    public MotoPartidaPedal() {
    	super();
    }

    public MotoPartidaPedal(int numRodas, int velMax) {
        super(numRodas, velMax);
    }
    public void acelerar(boolean acelerador){
        if (acelerador) {
            this.acelerador = true;
        }
    }
    
    public void ligar(){
    	if(this.acelerador) {
    		this.ligado = acelerador;
    	}
    }
    public String toString() {
    	return "\nmoto partida pedaç"+
                "\nnumero de rodas: "+getNumRodas()+
    			"\nvelocidade maxima: "+getVelMax()+
    			"\nligado: "+getLigado();
    }
}
