package MyPackage;

public class EncapsulationEg2 {
public static void main(String[] args) {
	Bank b = new Bank();
    b.setAccount_num(4535665456759867L);
    b.setName("Gaurav");
    b.setAmount(567854);
    b.setEmail("xyz@gmail.com");
    
    System.out.println(b.getAccount_num()+" "+b.getName()+" "+b.getAmount()+" "+b.getEmail());
    	
}
}