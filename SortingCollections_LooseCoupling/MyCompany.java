package SortingCollections_LooseCoupling;

import java.util.*;

interface Client{
    double getCharges();
    double calculatePayment(GregorianCalendar invoiceDate);
    void sendEmail(double payment);
}

abstract class ClientClass implements Client,Comparable<ClientClass> {

    int id;
    String name;    
    String email;
    double charges;
    GregorianCalendar dateOfAgreement;

    public ClientClass(int id, String name, String email, double charges, GregorianCalendar dateOfAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.charges = charges;
        this.dateOfAgreement = dateOfAgreement;
    }

    @Override
    public double getCharges() {
        return this.charges;
    }

    @Override
    public void sendEmail(double payment){
        System.out.println("Your Pending Payment Amount :"+payment);
    }

    @Override
    public int compareTo(ClientClass o) {
        return this.id-o.id;
    }  
}

class Customer extends ClientClass{    

    public Customer(int id, String name, String email, double charges, GregorianCalendar dateOfAgreement) {
        super(id, name, email, charges, dateOfAgreement);
    }

    public double calculatePayment(GregorianCalendar invoiceDate) {
        return (double) (getCharges() * (invoiceDate.get(Calendar.DATE) - dateOfAgreement.get(Calendar.DATE)));
    }

    @Override
    public String toString() {
        return "Customer [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement.getTime() + ", email=" + email + ", id="
                + id + ", name=" + name + "]";
    }
 
}

class Business extends ClientClass {
    
    double gstRate;
    
    public Business(int id, String name, String email, double charges, double gstRate, GregorianCalendar dateOfAgreement) {
        super(id, name, email, charges, dateOfAgreement);
        this.gstRate = gstRate;
        
    }

    double getGST(){
        return this.gstRate;
    }

    public double calculatePayment(GregorianCalendar invoiceDate) {
        return (double) (getCharges()*this.gstRate * (invoiceDate.get(Calendar.DATE) - dateOfAgreement.get(Calendar.DATE)));
    }
    
    
    @Override
    public String toString() {
        return "Business [charges=" + charges + ", dateOfAgreement=" + dateOfAgreement.getTime() + ", email=" + email
                + ", gstRate=" + gstRate + ", id=" + id + ", name=" + name + "]";
    }

}
public class MyCompany {
    public static void main(String[] args) {
        ClientClass customer1 = new Customer(102,"Deepika","deepika@gmail.com",120,new GregorianCalendar(2022, 2, 20));
        ClientClass customer2 = new Customer(101,"Jhansi","jhansi@gmail.com",100,new GregorianCalendar(2022, 2, 7));
        ClientClass business1 = new Business(105,"abc","abc@gmail.com",130,2,new GregorianCalendar(2022, 2, 2));
        ClientClass business2 = new Business(100,"def","def@gmail.com",200,3,new GregorianCalendar(2022, 2, 10));
        ArrayList<ClientClass> clientObjects = new ArrayList<>();
        clientObjects.add(customer1);
        clientObjects.add(customer2);
        clientObjects.add(business1);
        clientObjects.add(business2);
        double[] pendingPayments = new double[clientObjects.size()];
        for(int i=0;i<pendingPayments.length;i++){
            pendingPayments[i] = clientObjects.get(i).calculatePayment(new GregorianCalendar(2022, 2,31));
            if(pendingPayments[i] != 0)
                clientObjects.get(i).sendEmail(pendingPayments[i]);
        }
        Collections.sort(clientObjects);
        System.out.println("\nSorting According to ID:");
        clientObjects.forEach(System.out::println);

        clientObjects.sort((obj1,obj2)->(int)(obj1.getCharges()-obj2.getCharges()));
        System.out.println("\nSorting According to Charges:");
        clientObjects.forEach(System.out::println);

        clientObjects.sort((obj1,obj2)->(int)(obj1.dateOfAgreement.get(Calendar.DATE)-obj2.dateOfAgreement.get(Calendar.DATE)));
        System.out.println("\nSorting According to Date:");
        clientObjects.forEach(System.out::println);

    }
    
}
