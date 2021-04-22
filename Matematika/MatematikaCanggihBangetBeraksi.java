
package Matematika;

public class MatematikaCanggihBangetBeraksi {
     public static void main (String [] args){
        MatematikaCanggihBanget math = new MatematikaCanggihBanget();
        
        math.setpertambahanEmpat(10, 10, 10, 10);        
                System.out.println("Hasil dari 10 + 10 + 10 + 10 adalah : " +math.getpertambahanEmpat());
        math.setpertambahan(20, 20);
                System.out.println("Hasil dari 20 + 20 adalah : " +math.getpertambahan());
        math.setperkalian(5, 5);
                System.out.println("Hasil dari 5 * 5 adalah : " +math.getperkalian());
        math.setmodulus(20,3);
                System.out.println("Hasil modulus adalah : " +math.getmodulus());
                
}
}

