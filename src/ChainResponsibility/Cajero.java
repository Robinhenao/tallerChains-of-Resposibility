package ChainResponsibility;

import java.util.Scanner;

public class Cajero {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Cajero cajero=new Cajero();
            Billete billete100000 = new Billete(100000);
            Billete billete50000 = new Billete(50000);
            Billete billete20000 = new Billete(20000);
            Billete billete10000 = new Billete(10000);
            Billete billete5000 = new Billete(5000);

            DispensarBilletes dispensar5000 = new DispensarBilletes(billete5000);
            DispensarBilletes dispensar10000 = new DispensarBilletes(billete10000);
            DispensarBilletes dispensar20000 = new DispensarBilletes(billete20000);
            DispensarBilletes dispensar50000 = new DispensarBilletes(billete50000);
            DispensarBilletes dispensar100000 = new DispensarBilletes(billete100000);


            dispensar100000.setSiguiente(dispensar50000);
            dispensar50000.setSiguiente(dispensar20000);
            dispensar20000.setSiguiente(dispensar10000);
            dispensar10000.setSiguiente(dispensar5000);
            dispensar5000.setSiguiente(null);

            System.out.println("Digite monto a retirar");
            int monto = sc.nextInt();

            cajero.retirarBilletes(monto, dispensar100000);
        }

        public void retirarBilletes(int monto, DispensarBilletes dispensador) {
            if (monto % 5000 != 0) {
                System.out.println("el monto que ingreso no es multiplo de 5000");
            } else {
                dispensador.dispensar(monto);
            }
        }
    }

