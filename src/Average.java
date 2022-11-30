import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double avg;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik :" );
        mat = input.nextInt();
        if(mat < 0 || mat > 100){
            mat = 0;
        }

        System.out.print("Fizik :" );
        fizik = input.nextInt();
        if(fizik < 0 || fizik > 100){
            fizik = 0;
        }

        System.out.print("Türkçe :" );
        turkce = input.nextInt();
        if(turkce < 0 || turkce > 100){
            turkce = 0;
        }

        System.out.print("Kimya :" );
        kimya = input.nextInt();
        if(kimya < 0 || kimya > 100){
            kimya = 0;
        }

        System.out.print("Müzik :" );
        muzik = input.nextInt();
        if(muzik < 0 || muzik > 100){
            muzik = 0;
        }

        avg = (mat + fizik + turkce + kimya + muzik) / 5;

        System.out.println("Matematik : " + mat);
        System.out.println("Fizik : " + fizik);
        System.out.println("Türkçe : " + turkce);
        System.out.println("Kimya : " + kimya);
        System.out.println("Müzik : " + muzik);
        if (avg < 55) {
            System.out.println("Sınıfı geçemediniz..");
        }
        else {
            System.out.println("Tebrikler, başarıyla geçtiniz.");
        }
        System.out.println("Ortalama Notunuz : " + avg);

    }
}
