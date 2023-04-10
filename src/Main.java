public class Main {
    public static void main(String[] args) {
        System.out.println("Probando objeto coche");
        Coche coche = new Coche(4);
        System.out.println(coche.numeroDePuertas);
        coche.puerta();
        System.out.println(coche.numeroDePuertas);
        SumaMia sumaMia= new SumaMia();

    }
}
class Coche {
    int numeroDePuertas;
    public Coche(int puertas){
        numeroDePuertas = puertas;
        System.out.println("Estoy en el constructor" + numeroDePuertas);
    }
    public void puerta(){
        numeroDePuertas += 1;
    }

}

class SumaMia {
    int a=2;
    int b=5;
    int c=8;

    public SumaMia(){
        int sum;
        sum = (a+ b+ c);
        System.out.println(sum);
    }
}