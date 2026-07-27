public class Expense {
  private String description;
  private double amount;
  private String category;
  public Expense(String description,double amount,String category){
    this.description = description;
    this.amount = amount;
    this.category = category;
  }
  public String getDescription(){
    return description;
  }
  public double getAmount(){
    return amount;
  }
  public String getCategory(){
    return category;
  }
  public void setAmount(double amount){
    if(amount > 0){
      this.amount = amount;
    }
    else{
      System.out.println("Amount must be greater than zero");
    }
  }
  public void setDescription(String description) {
    this.description = description;
}
  public void setCategory(String category) {
    this.category = category;
}
}
