import java.util.Date;

public class Carne extends Alimento{
    private double peso;
    private int pedacos;

    public Carne(String nome, double custo, Date validade, double peso, int pedacos){
        super(nome, custo, validade);
        this.peso = peso;
        this.pedacos = pedacos;
    }

    public double calcularPreco() {
        return 0;
    }

    public Date verficarValidade() {
        return null;
    }

    public String toString() {
        return super.toString() + "\nPeso: " + this.peso + "\nPedacos: " + this.pedacos;
    }
}
