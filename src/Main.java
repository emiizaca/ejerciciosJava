public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*System.out.println(suma(5,6,7));
        Coche coche = new Coche();
        coche.sumarPuerta();
        System.out.println(coche.numeroPuertas);*/
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("El número ingresado es positivo");
        } else if (numeroIf < 0){
            System.out.println("El número ingrsado es negativo");
        } else {
            System.out.println("El número es 0.");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("Numero vale: "+numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("Numero vale: "+numeroWhile);
            numeroWhile++;
        }while(numeroWhile < 3);

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "invierno";
        switch(estacion){
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("No existe esa estacion");
                break;
        }
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