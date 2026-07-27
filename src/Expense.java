public class Expense {
  private String description;
  private double amount;
  private String category;
  public double getAmount(){
    return amount;
  }
  public void setAmount(double amount){
    if(amount > 0){
      this.amount = amount;
    }
    else{
      System.out.println("Amount must be greater than zero");
    }
  }
}
