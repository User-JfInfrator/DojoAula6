public class Pessoa {

    private String nome;
    private int qtdLivrosLidos;
    private Livro[] livro;

    public Pessoa(Livro[] livro){
        this.livro = livro;
    }
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdLivrosLidos() {
        return qtdLivrosLidos;
    }
    public void setQtdLivrosLidos(int qtdLivrosLidos) {
        this.qtdLivrosLidos = qtdLivrosLidos;
    }
    public Livro[] getLivro() {
        return livro;
    }
    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }
    
    
}
