public abstract class Menu 
{ 
  // aqui defino a quantidade como um valor inteiuro 
  protected double salario;
  public abstract double ganha();
  protected double valorPeca;

  public double calculaBonus() {
    return salario * 0.10;
  }


  public void peca() {
    System.out.println("O valor de cada peça é ");
}



  // aqui to inicializando a classe 
  Menu() 
  {
    // print para iniciar o menu 
    System.out.println("---- Opções de Automóveis ----");

  }


}