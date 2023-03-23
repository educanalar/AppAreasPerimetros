import com.areaspoo.herencia.*;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado1(15.0f);
        String areaBaseCuadro = "El lado del cuadrado mide " + cuadrado.getLado1() + " u" +
                "\nSu area mide: " + cuadrado.calcularArea() + " u^2" +
                "\nSu perimetro: " + cuadrado.calcularPerimetro();
        System.out.println(areaBaseCuadro);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setLado1(2.0f);
        rectangulo.setLado2(4.0f);
        String areaBaseRectangulo = "\nEl ancho del rectangulo mide " + rectangulo.getLado1() + " u" +
                "\nEl largo del rectangulo mide " + rectangulo.getLado2() + " u" +
                "\nSu area mide " + rectangulo.calcularArea() + " u^2" +
                "\nSu perimetro mide: " + rectangulo.calcularPerimetro() + " u";
        System.out.println(areaBaseRectangulo);

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(4.0f);
        triangulo.setBase(6.0f);
        triangulo.setLado(4.0f);
        triangulo.setLado1(6.0f);
        String areaPerimetroTriangulo = "\nLa base del triangulos mide: " + triangulo.getBase() + " u" +
                "\nSu altura del triangulo mide: " + triangulo.getAltura() + " u" +
                "\nEl cateto opuesto del triangulo mide: " + triangulo.getLado() + " u" +
                "\nEl cateto adyacente del triangulo mide: " + triangulo.getLado1() + " u" +
                "\nEl perimetro del triangulo mide: " + triangulo.calcularPerimetro() + " u" +
                "\nEl area del triangulo mide: " + triangulo.calcularArea() + " u^2";
        System.out.println(areaPerimetroTriangulo);

        Rombo rombo = new Rombo();
        rombo.setDiagonalMayor(30.0f);
        rombo.setDiagonalMenor(16.0f);
        rombo.setLado(17.0f);
        String areaPerimetroRombo = "\nLa diagonal mayor del rombo mide: " + rombo.getDiagonalMayor() + " u" +
                "\nLa diagonal menor del rombo mide: " + rombo.getDiagonalMenor() + " u" +
                "\nLa medida del lado del rombo mide: " + rombo.getLado() + " u" +
                "\nEl perimetro del rombo mide:  " + rombo.calcularPerimetro() + " u" +
                "\nEl area del rombo mide: " + rombo.calcularArea() + " u^2";
        System.out.println(areaPerimetroRombo);

        Pentagono pentagono = new Pentagono();
        pentagono.setLado(3.0f);
        pentagono.setApotema(2.0f);
        String areaPerimetroPentagono = "\nLa medida de un lado del pentagono mide: " + pentagono.getLado() + " u" +
                "\nLa medida de la apotema del pentagono mide: " + pentagono.getApotema() + " u" +
                "\nEl perimetro del pentagono es: " + pentagono.calcularPerimetro() + " u" +
                "\nEl area del pentagono mide: " + pentagono.calcularArea() + " u^2";
        System.out.println(areaPerimetroPentagono);

        Hexagono hexagono = new Hexagono();
        hexagono.setLado(3.0f);
        hexagono.setApotema(2.7f);
        String areaPerimetroHexagono = "\nLa medida de un lado del hexagono mide: " + hexagono.getLado() + " u" +
                "\nLa medida de la apotema del hexagono mide: " + hexagono.getApotema() + " u" +
                "\nEl perimetro del hexagono mide: " + hexagono.calcularPerimetro() + " u" +
                "\nEl area del hexagono mide: " + hexagono.calcularArea() + " u^2";
        System.out.println(areaPerimetroHexagono);

        Circulo circulo = new Circulo();
        circulo.setPi(3.1416f);
        circulo.setRadio(5.0f);
        String areaPerimetroCirculo = "\nLa medida del radio del circulo mide: " + circulo.getRadio() + " u" +
                "\nEl perimetro del circulo mide: " + circulo.calcularPerimetro() + " u" +
                "\nEl area del circulo mide: " + circulo.calcularArea() + " u^2";
        System.out.println(areaPerimetroCirculo);

        Trapecio trapecio = new Trapecio();
        trapecio.setAltura(5.0f);
        trapecio.setBaseMayor(10.0f);
        trapecio.setBaseMenor(5.0f);
        trapecio.setLado(6.0f);
        trapecio.setLado2(6.0f);
        String areaPerimetroTrapecio = "\nLa altura de el trapecio mide:  " + trapecio.getAltura() + " u" +
                "\nLa base mayor del trapecio mide: " + trapecio.getBaseMayor() + " u" +
                "\nLa base menor del trapecio mide " + trapecio.getBaseMenor() + " u" +
                "\nLa medida del lado derecho del trapecio mide: " + trapecio.getLado() + " u" +
                "\nLa medida del lado izquiero del trapecio mide: " + trapecio.getLado2() + " u" +
                "\nEl area del trapecio mide: " + trapecio.calcularArea() + " u^2" +
                "\nEl ´perimetro del trapecio mide: " + trapecio.calcularPerimetro() + " u";
        System.out.println(areaPerimetroTrapecio);

        Paralelogramo paralelogramo = new Paralelogramo();
        paralelogramo.setAltura(4.0f);
        paralelogramo.setBase(9.0f);
        paralelogramo.setLado(6.0f);
        String areaPerimetroParalelogramo = "\nLa altura del paralelogramo mide: "+ paralelogramo.getAltura() + " u" +
                "\nLa base del paralelogramo mide: " + paralelogramo.getBase() + " u" +
                "\nEl lado izquierdo del paralelogramo mide: " + paralelogramo.getLado()+ " u" +
                "\nEl area del paralelogramo mide: "+ paralelogramo.calcularArea() + " u^2" +
                "\nEl perimetro del paralelogramos mide: "+ paralelogramo.calcularPerimetro() + " u";
        System.out.println(areaPerimetroParalelogramo);







    }
}