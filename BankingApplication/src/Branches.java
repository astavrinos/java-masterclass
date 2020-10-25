import java.util.ArrayList;

public class Branches {

    private String branchName;
    private ArrayList<Customers> customers;

    public Branches(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customers>();
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customers existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName) {
        for (Customers customer : customers) {
            if (customer.getCustomerName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

}
