public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.AumentarPuerta();
        System.out.println(miCoche.puertas);

    }
static class coche {
     public int puertas= 4;

     public void AumentarPuerta() {
             this.puertas++;
    }
}
}


