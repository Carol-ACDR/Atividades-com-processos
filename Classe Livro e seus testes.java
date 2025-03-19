public class Livro {
public String nome;
public int edição;
public String autor;
public int ISBN;

public Livro(String nome,int edição, String autor, int ISBN){
this.nome = nome;
this.edição = edição;
this.autor = autor;
this.ISBN = ISBN;
}
public String getnome(){
return this.nome;
}
public int getedição(){
return this.edição;
}
public String getautor(){
return this.autor;
}
public int getISBN(){
return this.ISBN;

}
public void setnome(String x){
this.nome = x;
}
public void setedição(int y){
this.edição = y;
}
public void setautor(String z){
this.autor = z;
}
public void setISBN(int h){
this.ISBN = h;
}
public boolean verificaLancamento() {
if (edição > 2022){
return true;
}
else {
return false;
}
}
}

import junit.framework.TestCase;
public class LivroTeste extends TestCase {
public void testLivro() {
Livro tt = new Livro("A",2023,"A",2);
assertTrue(tt.verificaLancamento()==true);
Livro tt2 = new Livro("A",2022,"A",2);
assertTrue(tt2.verificaLancamento()==false);
Livro tt3 = new Livro("A",2024,"A",2);
assertTrue(tt3.verificaLancamento()==true);
Livro tt4 = new Livro("A",0,"A",2);
assertTrue(tt4.verificaLancamento()==false);

}
}
