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
   public void displayExpenses() {
    for (Expense expense : expenses) {
        System.out.println(
            expense.getDescription() + " - $" +
            expense.getAmount() + " - " +
            expense.getCategory()
        );
}
    }
    public void displayExpensesByCategory(String category) {
    for (Expense expense : expenses) {
        if (expense.getCategory().equalsIgnoreCase(category)) {
            System.out.println(
                expense.getDescription() + " - $" +
                expense.getAmount() + " - " +
                expense.getCategory()
            );
        }
    }
}
    public int getExpenseCount() {
        return expenses.size();
}
    public void searchExpense(String description) {
    for (Expense expense : expenses) {
        if (expense.getDescription().equalsIgnoreCase(description)) {
            System.out.println(
                expense.getDescription() + " - $" +
                expense.getAmount() + " - " +
                expense.getCategory()
            );
            return;
        }
    }

    System.out.println("Expense not found.");
}
}
