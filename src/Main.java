public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Expense expense1 = new Expense("Food", 500, "Food");
        Expense expense2 = new Expense("Travel", 250, "Transport");
        tracker.addExpense(expense1);
        tracker.addExpense(expense2);
        tracker.displayExpenses();
        System.out.println("\nFood Expenses:");
        tracker.displayExpensesByCategory("Food");
        System.out.println("Total expenses: " + tracker.calculateTotalExpenses());
        tracker.deleteExpense(expense1);
        System.out.println("Total after deletion: " + tracker.calculateTotalExpenses());
    }
}
