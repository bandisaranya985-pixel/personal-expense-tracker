import java.util.ArrayList;
public class ExpenseTracker {
    private ArrayList<Expense> expenses = new ArrayList<>();
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
    public double calculateTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
    public void deleteExpense(Expense expense) {
        expenses.remove(expense);
    }
    public void displayExpense(){
        for(Expense expense : expense){
            System.out.println(expense.getDescription()+"-$"+expense.getAmount()+"-"+expense.getCategory()
}
