import java.util.Scanner;

public class voidsegitiga {
    
    double a, t, h;
    
    void input (){
       
        Scanner ketik = new Scanner(System.in);
       
        System.out.print("Masukkan Alas Segitiga =  ");
        a = ketik.nextDouble();
       
        System.out.print("Masukkan Tinggi Segitiga =  ");
        t = ketik.nextDouble();
    }
    void hitung(){
        System.out.println("Luas Segitiga = "+a+"*"+t+"/2");
    }
    double hasil (){
        h = a*t/2;
        return h;
    }   
}
