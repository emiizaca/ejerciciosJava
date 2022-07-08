public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(suma(5,6,7));
        Coche coche = new Coche();
        coche.sumarPuerta();
        System.out.println(coche.numeroPuertas);
    }
    public static int suma(int n1, int n2, int n3){
        return n1+n2+n3;
    }

}

class Coche{
    int numeroPuertas;

    public int sumarPuerta(){
        return numeroPuertas++;
    };

}