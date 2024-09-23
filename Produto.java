import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Produto{
    // Atributos
    String nome;
    String fabricacao;
    String validade;
    double precoCusto;
    double precoVenda;

    // Construtor caso entrada nula
    public Produto(){
    }

    // Construtor com todos os atributos
    public Produto(String nome, double precoCusto, double precoVenda, String fabricacao, String validade){
        this.nome = nome;
        this.fabricacao = fabricacao;
        this.validade = validade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Construtor com validade automatizada
    public Produto(String nome, double precoCusto, double precoVenda, String fabricacao){
        this.nome = nome;
        this.fabricacao = fabricacao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.validade = autoValidade();
    }
    
    // Método para automatizar a validade
    private String autoValidade(){
        DateTimeFormatter formatadorLD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatadorStr = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String validade[] = this.fabricacao.split("/");
        String validadetmp;

        validadetmp = validade[2] +"-"+ validade[1] +"-"+ validade[0];

        LocalDate validadeLD = LocalDate.parse(validadetmp, formatadorLD);
        validadeLD = validadeLD.plusMonths(1);

        validadetmp = validadeLD.format(formatadorStr).replaceAll("-", "/");

        return validadetmp;
    }

    // GETTERS
    // Getter nome
    public String getNome(){
        return nome;
    }
    
    // Getter fabricacao
    public String getFabricacao(){
        return fabricacao;
    }

    // Getter validade
    public String getValidade() {
        return validade;
    }

    // Getter precoCusto
    public double getPrecoCusto(){
        return precoCusto;
    }

    // Getter precoVenda
    public double getPrecoVenda(){
        return precoVenda;
    }


    // SETTERS
    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter precoCusto
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    // Setter precoVenda
    public void setPrecoVenda(double precoVenda){
        this.precoVenda = precoVenda;
    }
    
    // Setter fabricacao
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }

    // Setter fabricacao
    public void setValidade(String validade) {
        this.validade = validade;
    }
}