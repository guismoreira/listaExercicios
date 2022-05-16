package listaExercicios.automovel;

public class Automovel {
    private int numRodas;
    private int velMax;
    protected boolean ligado;

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
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
            this.ligado = true;
    }

    public void desligar(){
            this.ligado = false;
    }
    public Automovel(){

    }
    public Automovel(int numRodas, int velMax){
        this.numRodas = numRodas;
        this.velMax = velMax;
    }
    public String toString(){
        return  "\nnumero de rodas: "+this.numRodas+
                "\nvelocidade maxima: "+this.velMax+
                "\nligado: "+this.ligado;
    }
}
