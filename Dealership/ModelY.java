
public class ModelY extends Carro{
    private Double valor;
    private int revisoes;


    public ModelY(String marcaAutomovel, int kilometragem, Double valor) {
        super(marcaAutomovel, kilometragem);
        this.valor = valor;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("O valor é de: " + valor);
    }

    public void ganhar(int pontos) {
        kilometragem += pontos;
        valor += valor * (pontos * 4);
    }

    public void  perder(int pontos) {
        kilometragem += - pontos;
        valor += - (pontos * 4);
    }

    public void revisoes(int kilometragem) {
        revisoes = revisoes / 2;
    }

}
