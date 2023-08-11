public class FrapuccinoComCafe extends Frapuccino {
  private Cafe cafe;
  
  public FrapuccinoComCafe(){
      this.cafe = new Cafe("nao definido");
  }
  public FrapuccinoComCafe(String grao){
      this.cafe = new Cafe(grao);
  }
  public double getPreco() {
      if (cafe.getGrao().equals("Bourbon")) {
          return 4.5+13;
      } else if (cafe.getGrao().equals("Catuaí")) {
          return 6+13;
      } else if (cafe.getGrao().equals("Blend")) {
          return 5.3+13;
      } else {
          return 0; 
      }
  }
  public Cafe getCafe() {
      return cafe;
  }
  public void setCafe(Cafe cafe) {
      this.cafe = cafe;
  }
  @Override
  public String toString() {
      return "Frapuccino com Cafe " + cafe.getGrao();
  } 
}