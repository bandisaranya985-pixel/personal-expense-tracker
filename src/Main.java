public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Expense expense1 = new Expense("Food", 500, "Food");
        Expense expense2 = new Expense("Travel", 250, "Transport");
        tracker.addExpense(expense1);
        tracker.addExpense(expense2);
        System.out.println("Before update:");
        tracker.displayExpenses();
        expense1.setAmount(600);
        System.out.println("\nAfter update:");
        tracker.displayExpenses();
        System.out.println("Number of expenses: " + tracker.getExpenseCount());
        System.out.println("\nSearching for Food:");
        tracker.searchExpense("Food");
        System.out.println("\nFood Expenses:");
        tracker.displayExpensesByCategory("Food");
        System.out.println("Total expenses: " + tracker.calculateTotalExpenses());
        tracker.deleteExpense(expense1);
        System.out.println("Total after deletion: " + tracker.calculateTotalExpenses());
    }
}
