

public class ModelX extends Carro{
    private Double valor;
    private int revisoes;


    public ModelX(String marcaAutomovel, int kilometragem, Double valor) {
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
  //sao metodos que vao adicionar km pro valor
    public void revisoes(int kilometragem) {
        revisoes = revisoes / 2;
    }

}