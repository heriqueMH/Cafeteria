public class Chocolate extends Quente {
  private double percentual;

  public Chocolate(){
  }
  public Chocolate(double percentual){
      this.percentual = percentual;
  }
  public double getPercentual() {
      return percentual;
  }
  public void setPercentual(double percentual) {
      this.percentual = percentual;
  }
  @Override
  public double getPreco() {
      if (percentual == 70) {
          return 14;
      } else if (percentual == 50) {
          return 12;
      }else{
          return 10.5;
      }
  }
  public String toString(){
      return "== chocolate == " + percentual + "%";
  }
}