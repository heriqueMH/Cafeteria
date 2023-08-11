public class Capuccino extends Quente{
  private Chocolate chocolate;
  private Cafe cafe;
  
  public Capuccino(String grao, double percentual ){
      this.cafe = new Cafe(grao);
      this.chocolate = new Chocolate(percentual);
  }
  public Chocolate getChocolate() {
      return chocolate;
  }
  public void setChocolate(Chocolate chocolate) {
      this.chocolate = chocolate;
  }
  public Cafe getCafe() {
      return cafe;
  }
  public void setCafe(Cafe cafe) {
      this.cafe = cafe;
  }
  @Override
  public double getPreco() {
       return cafe.getPreco()+chocolate.getPreco()+2;
  }
  public String toString(){
      return "== capuccino == " + chocolate.getPercentual() + "% e " + cafe.getGrao();
  }
}

