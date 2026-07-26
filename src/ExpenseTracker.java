import java.util.ArrayList;
public class ExpenseTracker{
  private ArrayList<Expense>expenses = new ArrayList<>();
  public void addExpense(Expense expense){
    expenses.add(expense);
  }
}
