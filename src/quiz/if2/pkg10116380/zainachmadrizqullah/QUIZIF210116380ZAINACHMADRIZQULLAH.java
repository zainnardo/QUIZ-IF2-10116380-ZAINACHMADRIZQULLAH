/*

 */
package quiz.if2.pkg10116380.zainachmadrizqullah;

import java.util.Scanner;

/**
*NAMA   : Zain Achmad Rizqullah
*KELAS  : PBO2
*NIM    : 10116380
*Deskripsi Program : Rock and Roll Haircut
 */
public class QUIZIF210116380ZAINACHMADRIZQULLAH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        ServicePrice sp = new ServicePrice();
        Customer cst    = new Customer();
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        cst.setNama(scanner.next());
        System.out.print("Customer Email \t : ");
        cst.setEmail(scanner.next());
        
        sp.displayService();
        serviceItem = scanner.nextInt();
        sp.setPriceService(sp.getPrice(serviceItem));
        
        System.out.print("Are you Member (yes/no) : ");
        isMember = sp.checkMemberStatus(scanner.next());
        
        discount = sp.getSale(isMember, sp.getPriceService());
        
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction : " + cst.currentTime());
        System.out.println("Service Price : " + sp.getPriceService());
        System.out.println("Discount : " + discount);
        System.out.println("Total Pay : " + sp.getTotalPay(sp.getPriceService(), discount));
    }
    
}