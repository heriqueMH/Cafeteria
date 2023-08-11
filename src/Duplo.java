public class Duplo extends Cafe {
  
  public Duplo(String grao) {
      super(grao);
  }
  public double getPreco(){
      if (getGrao().equals("Bourbon")) {
          return 4.5*2;
      } else if (getGrao().equals("Catuaí")) {
          return 6*2;
      }else if (getGrao().equals("Blend")) {
          return 5.3*2;
      }else{
          return 0;
      }
  }
  public void duploPreco() {
      double precoCafe = getPreco();
      setPreco(precoCafe * 2); 
  }
  @Override
  public String toString() {
      return "Café Duplo " + getGrao();
  }
}
