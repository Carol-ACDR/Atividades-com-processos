import java.util.ArrayList;

public class Biblioteca {
public String nome;
public int CNPJ;
public int AnoFundação;
public ArrayList<Livro> ListaLivros;
public Biblioteca(String nome,int CNPJ, int AnoFundação){
this.nome = nome;

this.CNPJ = CNPJ;
this.AnoFundação = AnoFundação;
this.ListaLivros = new ArrayList<Livro>();
}
public String getnome(){
return this.nome;
}
public int getCNPJ(){
return this.CNPJ;
}
public int getAnoFundação(){
return this.AnoFundação;
}
public void setnome(String x){
this.nome = x;
}
public void setCNPJ(int y){
this.CNPJ = y;
}
public void setISBN(int h){
this.AnoFundação = h;
}
public boolean patrimonioHistorico() {
if (AnoFundação < 1980){
return true;
}

else {
return false;
}
}
public void adicionarLivro(Livro a) {
this.ListaLivros.add(a);
}
public void removerLivro(Livro a) {
this.ListaLivros.remove(a);
}
public int quantidadeLivros() {
return this.ListaLivros.size();
}
public boolean acervoPremium() {
int lançamentos = 0;
for (int i = 0; i < quantidadeLivros(); i++) {
if (ListaLivros.get(i).verificaLancamento()) {
lançamentos +=1;
}
}
if(lançamentos >4) {return true;}
else {return false;}
}

}

import junit.framework.TestCase;
public class BibliotecaTest extends TestCase{
public void testBiblioteca() {
Biblioteca tt = new Biblioteca("A",2,1979);
assertTrue(tt.patrimonioHistorico()==true);
Biblioteca tt2 = new Biblioteca("A",2,1980);
assertTrue(tt2.patrimonioHistorico()==false);
Biblioteca tt3 = new Biblioteca("A",2,1652);
assertTrue(tt3.patrimonioHistorico()==true);
Biblioteca tt4 = new Biblioteca("A",2,2000);
assertTrue(tt4.patrimonioHistorico()==false);

}
public void testAcervo() {
Livro tt = new Livro("A",2023,"A",2);
Livro tt2 = new Livro("A",2023,"A",2);
Livro tt3 = new Livro("A",2023,"A",2);
Livro tt4 = new Livro("A",2023,"A",2);
Livro tt5 = new Livro("A",2023,"A",2);
Livro tt6 = new Livro("A",2022,"A",2);
Biblioteca BB = new Biblioteca("A",2,1979);
BB.adicionarLivro(tt);
BB.adicionarLivro(tt2);
BB.adicionarLivro(tt3);

BB.adicionarLivro(tt4);
BB.adicionarLivro(tt6);
assertTrue(BB.acervoPremium()==false);
BB.adicionarLivro(tt5);
assertTrue(BB.acervoPremium()==true);
}

}
