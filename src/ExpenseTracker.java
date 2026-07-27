import java.util.ArrayList;
public class ExpenseTracker{
  private ArrayList<Expense>expenses = new ArrayList<>();
  public void addExpense(Expense expense){
    expenses.add(expense);
  }
  public double calculateTotalExpense(){
    double Total = 0;
    for(Expense expense : expenses){
      total += expense.getAmount();
    }
    return total;
  }
}
