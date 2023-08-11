public class Cafe extends Quente{
  private String grao;

  private FrapuccinoComCafe frapuccinoComCafe;
  public Cafe(){
  }
  public Cafe(String grao){
      this.grao = grao;
  }
  public String getGrao() {
      return grao;
  }
  public FrapuccinoComCafe getFrapuccinoComCafe() {
      return frapuccinoComCafe;
  }
  public void setFrapuccinoComCafe(FrapuccinoComCafe frapuccinoComCafe) {
      this.frapuccinoComCafe = frapuccinoComCafe;
  }
  public void setGrao(String grao) {
      this.grao = grao;
  }
  @Override
  public double getPreco() {
      if (grao.equals("Bourbon")) {
          return 4.5;
      } else if (grao.equals("Catuaí")) {
          return 6;
      }else if (grao.equals("Blend")) {
          return 5.3;
      }else{
          return 0;
      }
  }
  public String toString(){
      return grao + " == Café ==";
  }
}