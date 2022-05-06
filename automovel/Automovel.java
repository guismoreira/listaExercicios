package listaExercicios.automovel;

public class Automovel {
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public int getNumRodas(){
        return this.numRodas;
    }
    public void setNumRodas(int numRodas){
        this.numRodas = numRodas;
    }
    public int getVelMax(){
        return this.velMax;
    }
    public void setVelMax(int velMax){
        this.velMax = velMax;
    }
    public boolean getLigado(){
        return this.ligado = ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
            ligado = true;
    }

    public void desligar(){
            ligado = false;
    }
    public Automovel(){

    }
    public Automovel(int numRodas, int velMax, boolean ligado){
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = ligado;
    }
    public String toString(){
        return  "\nnumero de rodas: "+this.numRodas+
                "\nvelocidade maxima: "+this.velMax+
                "\nligado: "+this.ligado;
    }
}
