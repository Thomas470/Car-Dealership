public class Carro {
    protected int kilometragem;

    public Carro(String marcaAutomovel, int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public void imprimir() {
        System.out.println("Kilometragem do carro: " + kilometragem);
    }


}
