//Autor: Willamy
//15/08/23
import java.util.Date;
public abstract class Alimento {
    private String nome;
    private double custo;
    private Date validade;
    public Alimento(String nome, double custo, Date validade){
        this.nome = nome;
        this.custo = custo;
        this.validade = validade;
    }
    public abstract double calcularPreco();
    public abstract Date verficarValidade(Date validade);
    public String toString() {
        return "Nome: " + this.nome + "\nCusto: " + this.custo + "\nValidade: " + this.validade;
    }
}
