Classe:
public class Calculadora {
//atributo
private int resultado = 0;
//método somar
public double somar (int n1, int n2) {
resultado = n1+n2;
return resultado;

}
//método subtrair
public double subtrair(int n1,int n2) {
resultado = n1 - n2;
return resultado;
}
//método multiplicar
public double multiplicar(int n1,int n2) {
resultado = n1 * n2;
return resultado;
}
//método dividir

public double dividir(int n1,int n2) {
resultado = n1 / n2;
return resultado;
}

}
Classe teste:
import junit.framework.TestCase;
public class CalculadoraTeste extends TestCase {
public void testCalculadora() {
Calculadora ct = new Calculadora();
assertTrue(ct.somar(50,50)==100);
Calculadora ct2 = new Calculadora();
assertTrue(ct2.subtrair(120,140)==-20);
Calculadora ct3 = new Calculadora();
assertTrue(ct3.multiplicar(2,4)==8);
Calculadora ct4 = new Calculadora();
assertTrue(ct4.dividir(8,4)==2);
}
}
