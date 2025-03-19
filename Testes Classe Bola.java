Classe:
public class Bola {
private String cor;
public Bola(String cor) {
this.cor = cor;

}
public String getCor() {
return this.cor;
}
public void setCor(String novaCor) {
this.cor = novaCor;
}
}
Classe teste:

import junit.framework.TestCase;
public class BolaTest extends TestCase {
public void testBola() {
Bola bt = new Bola("Azul");
assertTrue(bt.getCor()=="Azul");
bt.setCor("Vermelho");
assertTrue(bt.getCor()=="Vermelho");
}
}
