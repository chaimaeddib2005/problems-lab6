package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers =  new ArrayList();
    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer){
        if(customers.contains(customer)){
            return;
        }
        customers.add(customer);
    }
    public void addTransaction(Customer customer1,Customer customer2, double amount){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(customer1.getName())){
                for(int j = 0; j < customers.size(); j++){
                    if(customers.get(j).getName().equals(customer2.getName())){
                        customer1.addTransaction(-amount);
                        customer2.addTransaction(amount);
                    }
                }
            }
        }
    }
    public void DisplayData(){
        StringBuilder sb = new StringBuilder();
        sb.append("Bank:" +name+"\n");

        for(int i = 0; i < customers.size(); i++){
            sb.append(customers.get(i).toString()+"\n");
        }
        System.out.println(sb.toString());
    }
}
