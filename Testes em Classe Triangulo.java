Classe:
public class TRIANGULO {
private int l1;
private int l2;
private int l3;
public TRIANGULO(int l1, int l2, int l3) {
this.l1 = l1;
this.l2 = l2;
this.l3 = l3;
}
public String classificação() {
if((l1>0)&&(l2>0)&&(l3>0)&&(l1+l2>l3)&&(l1+l3>l2)&&(l2+l3>l1)) {
if((l1!=l2)&&(l1!=l3)&&(l2!=l3)) {
return "escaleno";
}
else if((l1==l2)&&(l1==l3)&&(l2==l3)) {
return "equilátero";
}
else {
return "isósceles";
}
}

else {
return "Não é um TRIANGULO";
}
}
}
Classe teste:
import junit.framework.TestCase;
public class TRIANGULOteste extends TestCase {
public void testTriangulo() {
TRIANGULO tt = new TRIANGULO(4,2,3);
assertTrue(tt.classificação()=="escaleno");
TRIANGULO tt2 = new TRIANGULO(1,2,2);
assertTrue(tt2.classificação()=="isósceles");
TRIANGULO tt3 = new TRIANGULO(2,2,2);
assertTrue(tt3.classificação()=="equilátero");
TRIANGULO tt4 = new TRIANGULO(0,0,0);
assertTrue(tt4.classificação()=="Não é um TRIANGULO");
TRIANGULO tt5 = new TRIANGULO(-2,6,4);
assertTrue(tt5.classificação()=="Não é um TRIANGULO");

}
}
