
public class Main {
     public static void main(String[] args) {
    	 /*
    	 Movie m1=new Movie("Jack",2);
    	 Movie m2=new Movie("Rose",1);
    	 Movie m3=new Movie("Boss",0);
    	 Rental r1=new Rental(m1,5);
    	 Rental r2=new Rental(m2,6);
    	 Rental r3=new Rental(m3,4);
    	 Customer c1=new Customer("LiLei");
    	 c1.addRental(r1);
    	 c1.addRental(r2);
    	 c1.addRental(r3);
    	 System.out.print("�����嵥Ϊ��"+"\n"+c1.statement());
    	 */
    	 /*
    	 Customer customer=new Customer("����");
    	 customer.addRental(new Rental(new Movie("���ܳ�û��",2),5));
    	 customer.addRental(new Rental(new Movie("��ʮ�������",0),6));
    	 customer.addRental(new Rental(new Movie("������������4��",1),7));
    	 System.out.println("�����嵥��"+"\n"+customer.statement());*/
    	 Customer customer=new Customer("LiLei");
 		customer.addRental(new Rental(new Movie("Jack",2),6));
 		System.out.println(customer.statement());
     }   
}
