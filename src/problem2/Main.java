package problem2;

public class Main {
    public static void main(String[] args){
        Customer cus1 = new Customer("Ahmed");
        cus1.addTransaction(200.0);

        Customer cus2 = new Customer("Bob");
        cus2.addTransaction(300.0);
        Customer cus3 = new Customer("David");
        cus3.addTransaction(400.0);
        Customer cus4 = new Customer("Jack");
        cus4.addTransaction(500.0);
        Customer cus5 = new Customer("John");
        cus5.addTransaction(600.0);
        Customer cus6 = new Customer("Sam");
        cus6.addTransaction(700.0);
        Customer cus7 = new Customer("Jane");
        cus7.addTransaction(800.0);
        Bank bank = new Bank("SomePay");
        bank.addCustomer(cus1);
        bank.addCustomer(cus2);
        bank.addCustomer(cus3);
        bank.addCustomer(cus4);
        bank.addCustomer(cus5);
        bank.addCustomer(cus6);
        bank.addCustomer(cus7);
        bank.DisplayData();
        bank.addTransaction(cus1,cus2,100);
        bank.addTransaction(cus3,cus4,200);
        bank.DisplayData();



    }
}
