public abstract class Bebida {
    private double preco;

    public Bebida(){
    }
    public Bebida(double preco){
        this.preco = preco;
    }
    public abstract double getPreco();

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


