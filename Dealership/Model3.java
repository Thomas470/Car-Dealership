
public class Model3 extends ModelY {
    private Double bonusPorCompra;
    private int revisoes;



    public Model3(String marcaAutomovel, int bonus, Double valor, Double bonusPorCompra) {
        super(marcaAutomovel, bonus, valor);
        this.bonusPorCompra = bonusPorCompra;
    }
    
    public void revisoes(int kilometragem) {
        revisoes = revisoes / 2;
    }

    @Override


    public void ganhar(int pontos) {
        super.ganhar(pontos);
        bonusPorCompra = bonusPorCompra * 2;
    }

    public void perder(int pontos) {
        super.perder(pontos);
        bonusPorCompra = bonusPorCompra / 2;
    }




}
