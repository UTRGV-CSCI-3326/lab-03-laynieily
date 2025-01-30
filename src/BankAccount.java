public class BankAccount{
    public static void main(String[] args) {
        //starts with $2175.37
        float balance = 2175.37f;
        // withdrew $302.50
        balance -= 302.50f;
        // deposit $50.03
        balance += 50.03f;
        // Doubled balance and added $20
        balance = (balance/2) + 20.00f;
        // withdrew $1 
        balance -= 1.00f;
        // doubled balance
        balance *= 2;
        // deposit $1
        balance += 1.00f;

        // Output balance to the hundreth place
        // okay here i am making a new variable that will store the rounded balance
        String formattedBalance = String.format("%.2f", balance);
        System.out.println("Bob's new balance is: $" + formattedBalance);
    }
}
