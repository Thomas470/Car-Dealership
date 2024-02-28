class Compra extends Menu 
{

  private double retorno;
  private int Bonus;
  public void LucroporCompra(int quantidade) 
  {
    this.Bonus = Bonus + quantidade;
  }

  public double ganha() {
    return retorno;
  }

  public double calculaBonus() {
    return this.salario * 0.20;
  }
}