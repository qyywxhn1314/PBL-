
public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("����");
    	 customer.addRental(new Rental(new Movie("���ܳ�û��",2),5));
    	 customer.addRental(new Rental(new Movie("��ʮ�������",0),6));
    	 customer.addRental(new Rental(new Movie("������������4��",1),7));
    	 System.out.println("���ã�"+"\n"+customer.statemant());
     }
}
