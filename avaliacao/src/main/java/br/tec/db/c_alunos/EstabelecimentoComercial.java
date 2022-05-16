package br.tec.db.c_alunos;

import java.time.LocalTime;
/**
 * Faça com que essa classe tenha informações e inteligência para imprimir o seguinte texto:
 *
 * Cristal Box Comércio e Representações
 * Endereço: R. Morretes, 181 - Santa Maria Goretti, Porto Alegre - RS
 * Horas: Aberto ⋅ Fecha às 18:00
 * Telefone: (51) 3012-6666
 * Website: https://cristalbox.com.br
 */
class TestaEstabelecimentoComercial{
    public static void main(String[] args) {
        EstabelecimentoComercial ec = new EstabelecimentoComercial(
                "Cristal Box Comércio e Representações",
                "R. Morretes, 181 - Santa Maria Goretti, Porto Alegre - RS",
                "(51) 3012-6666",
                "https://cristalbox.com.br"
        );
        System.out.println(ec);
    }
}



public class EstabelecimentoComercial {
    private String nomeEstabelecimento;
    private String endereco;
    private String telefone;
    private String website;
    private LocalTime horaAbertura;
    private LocalTime horaFechamento;

    public LocalTime getHoraAbertura() {
        return horaAbertura;
    }

    public void setHoraAbertura(LocalTime horaAbertura) {
        this.horaAbertura = horaAbertura;
    }

    public LocalTime getHoraFechamento() {
        return horaFechamento;
    }

    public void setHoraFechamento(LocalTime horaFechamento) {
        this.horaFechamento = horaFechamento;
    }



    public String getNomeEstabelecimento(){
        return this.nomeEstabelecimento;
    }
    public void setNomeEstabelecimento(String nomeEstabelecimento){
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    public EstabelecimentoComercial(){
        this.horaAbertura = LocalTime.parse("08:00");
        this.horaFechamento = LocalTime.parse("18:00");
    }
    public EstabelecimentoComercial(String nomeEstabelecimento, String endereco, String telefone, String website){
        this.horaAbertura = LocalTime.parse("08:00");
        this.horaFechamento = LocalTime.parse("18:00");
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.website = website;
    }


    public String toString(){
        LocalTime horaAtual = LocalTime.now();
        String horas = "\nHoras: Fechado  Abre às " + getHoraAbertura();
        if(horaAtual.isAfter(getHoraAbertura()) && horaAtual.isBefore(getHoraFechamento())){
           horas = "\nHoras: Aberto  Fecha às " + getHoraFechamento();
        }
        return getNomeEstabelecimento()+
                "\nEndereco: "+getNomeEstabelecimento()+
                horas+
                "\nTelefone: "+getTelefone()+
                "\nWebsite: "+getWebsite();
    }

}
