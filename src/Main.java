public class Main{
  public static void main(String args[]){
    ExpenseTracker tracker = new ExpenseTracker();
    Expense expense1 = new Expense();
    expense1.setAmount(500);
    Expense expense2 = new Expense();
    expense2.setAmount(250);
    tracker.addExpense(expense1);
    tracker.addExpense(expense2);
    System.out.println("Total expenses: " + tracker.calculateTotalExpenses());
    tracker.deleteExpense(expense1);
    System.out.println("Total after deltion: " + tracker.calculateTotalExpenses());
  }
}
