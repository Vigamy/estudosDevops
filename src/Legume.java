import java.util.Date;
public class Legume extends Alimento{
    private String textura;
    private boolean descascado;
    public Legume(String nome, double custo, Date validade, String textura, boolean descascado){
        super(numero, custo, validade);
        this.textura = textura;
        this.descascado = descascado;
    }
    public double calcularPreco() {
        return 0;
    }
    public Date verficarValidade() {
        return null;
    }

    public String toString(){
        return super.toString() + "\nTextura: " + this.textura + "\nDescascado: " + this.descascado;
    }
}
