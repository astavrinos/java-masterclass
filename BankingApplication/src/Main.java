public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Cyprus");
        bank.addBranch("Limassol Branch");
        bank.addCustomer("Limassol Branch", "Adamos", 165.58);
        bank.addCustomer("Limassol Branch", "Jim", 14.58);
        bank.addCustomer("Limassol Branch", "May", 15.99);

        bank.addBranch("Nicosia Branch");
        bank.addCustomer("Nicosia Branch", "Michalis", 1.58);
        bank.addCustomer("Nicosia Branch", "Andy", 1454.58);
        bank.addCustomer("Nicosia Branch", "Beam", 158.99);

        bank.listCustomers("Limassol Branch", true);

    }

}
