
public class Main {
     public static void main(String[] args) {
    	 Customer customer=new Customer("����");
    	 customer.addRental(new Rental(new Movie("��ϲ�������̫�ǡ�",2),5));
    	 customer.addRental(new Rental(new Movie("��ʮ�������",0),4));
    	 customer.addRental(new Rental(new Movie("�����������ˡ�",1),3));
    	 System.out.println("���ĺţ�"+"\n"+customer.statemant());
     }
}
