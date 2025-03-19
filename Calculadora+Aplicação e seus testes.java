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

public class Aplicação {
public Calculadora Calc;
public String Op;
public Aplicação(String Op){
this.Op = Op;
this.Calc = new Calculadora();
}
public double realizaCalculo(int a, int b) {
if (Op == "soma"){
return Calc.somar(a,b);
}
else if (Op == "subtração"){
return Calc.subtrair(a,b);
}
else if (Op == "multiplicação"){
return Calc.multiplicar(a,b);
}
else {
return Calc.dividir(a,b);
}
}
}

import junit.framework.TestCase;
public class AplicaçãoTest extends TestCase{
public void testAplicação() {
Aplicação tt = new Aplicação("soma");

assertTrue(tt.realizaCalculo(3,3)==6);
Aplicação tt2 = new Aplicação("subtração");
assertTrue(tt2.realizaCalculo(3,3)==0);
Aplicação tt3 = new Aplicação("multiplicação");
assertTrue(tt3.realizaCalculo(3,3)==9);
Aplicação tt4 = new Aplicação("divisão");
assertTrue(tt4.realizaCalculo(3,3)==1);

Aplicação tt5 = new Aplicação("soma");

assertTrue(tt5.realizaCalculo(8,4)==12);
Aplicação tt6 = new Aplicação("subtração");
assertTrue(tt6.realizaCalculo(8,4)==4);
Aplicação tt7 = new Aplicação("multiplicação");
assertTrue(tt7.realizaCalculo(8,4)==32);
Aplicação tt8 = new Aplicação("divisão");
assertTrue(tt8.realizaCalculo(8,4)==2);
}
}
