package listaExercicios;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class EmprestimoEx16{
    private LocalDate dataEmprestimo;
    private List<LivroEx16> livro;
    private PessoaEx16 pessoa;

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public List<LivroEx16> getLivro() {
        return livro;
    }

    public void setLivro(List<LivroEx16> livro) {
        this.livro = livro;
    }

    public PessoaEx16 getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEx16 pessoa) {
        this.pessoa = pessoa;
    }

    public EmprestimoEx16(LocalDate dataEmprestimo, List<LivroEx16> livro, PessoaEx16 pessoa) {
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.pessoa = pessoa;
    }
    public EmprestimoEx16(LocalDate dataEmprestimo, List<LivroEx16> livro){
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
    }
    public EmprestimoEx16(){}

    @Override
    public String toString() {
        return "EmprestimoEx16{" +
                "dataEmprestimo=" + dataEmprestimo +
                ", livro=" + livro +
                ", pessoa=" + pessoa +
                '}';
    }
}
class LivroEx16{
    private String titulo;
    private String autor;
    private EmprestimoEx16 emprestimo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public EmprestimoEx16 getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(EmprestimoEx16 emprestimo) {
        this.emprestimo = emprestimo;
    }

    public LivroEx16(String titulo, String autor, EmprestimoEx16 emprestimo) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestimo = emprestimo;
    }
    public LivroEx16(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public LivroEx16(){}
}
class PessoaEx16{
    private String cpfCliente;
    private String nomeCliente;
    private EmprestimoEx16 emprestimo;

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public EmprestimoEx16 getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(EmprestimoEx16 emprestimo) {
        this.emprestimo = emprestimo;
    }

    public PessoaEx16(String cpfCliente, String nomeCliente, EmprestimoEx16 emprestimo) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.emprestimo = emprestimo;
    }
    public PessoaEx16(){}
}

public class Ex16 {
    public static void main(String[] args){

        List<LivroEx16> livros1 = Arrays.asList
                (
                        new LivroEx16("senhor dos aneis", "tolkien"),
                        new LivroEx16("sistemas operacionais", "tanembaum"),
                        new LivroEx16("era dos extremos", "hobsbawn")
                );


        livros1.stream()
                .filter(l -> l.getAutor().contains("tolkien"))
                .map(l -> l.getTitulo())
                .forEach(s -> System.out.println(s));

    }
}
