package ChainResponsibility;
class DispensarBilletes {
    private Billete billete;
    private DispensarBilletes siguiente;

    public DispensarBilletes(Billete billete) {
        this.billete = billete;
        this.siguiente = null;
    }

    public void setSiguiente(DispensarBilletes siguiente) {
        this.siguiente = siguiente;
    }

    public void dispensar(int monto) {
        int numBilletes = monto / billete.getDenominacion();
        int montoFaltante = monto % billete.getDenominacion();
        if (numBilletes > 0) {
            System.out.println("Dispensar " + numBilletes + " billetes de " + billete.getDenominacion());
        }
        if (montoFaltante > 0 && siguiente != null) {
            siguiente.dispensar(montoFaltante);
        }
    }
}


