import java.util.ArrayList;
public class Mecânico {
public int matricula;
public String nome;
public ArrayList<String> Especialidades;

public Mecânico(int Matricula,String nome){
this.nome = nome;
this.matricula = Matricula;
this.Especialidades = new ArrayList<String>();
}
public String getnome(){
return this.nome;
}
public int getmatricula(){
return this.matricula;
}
public void setnome(String x){
this.nome = x;
}
public void setmatricula(int y){
this.matricula = y;
}
public void adicionarEspecialidade(String a) {
this.Especialidades.add(a);
}
public void removerEspecialidade(String a) {
this.Especialidades.remove(a);
}
public int quantidadeEspecialidades() {
return this.Especialidades.size();
}
public boolean funcionarioPremium() {
if (quantidadeEspecialidades()>1) { return true;}
else {return false;}
}

}

import junit.framework.TestCase;
public class MecânicoTeste extends TestCase{
public void testMecânico() {
Mecânico tt = new Mecânico(0,"A");
assertTrue(tt.funcionarioPremium()==false);
tt.adicionarEspecialidade("Maluco");
assertTrue(tt.funcionarioPremium()==false);
tt.adicionarEspecialidade("Doido");
assertTrue(tt.funcionarioPremium()==true);
tt.adicionarEspecialidade("Pirado");
assertTrue(tt.funcionarioPremium()==true);
tt.removerEspecialidade("Maluco");
assertTrue(tt.funcionarioPremium()==true);
tt.removerEspecialidade("Pirado");
assertTrue(tt.funcionarioPremium()==false);
}
}

public class Veículo {
public String Placa;
public String Tipo;
public int NumOcorrencias;
public int AnoFabricação;
public Veículo(String Placa,String Tipo,int NumOcorrencias, int
AnoFabricação){
this.Placa = Placa;
this.Tipo = Tipo;
this.NumOcorrencias = NumOcorrencias;

this.AnoFabricação = AnoFabricação;
}
public String getPlaca(){
return this.Placa;
}
public String getTipo(){
return this.Tipo;
}
public int getNumOcorrencias(){
return this.NumOcorrencias;
}
public int getAnoFabricação(){
return this.AnoFabricação;
}
public void setPlaca(String x){
this.Placa = x;
}
public void setTipo(String x){
this.Tipo = x;
}
public void setNumOcorrencias(int y){
this.NumOcorrencias = y;
}
public void setAnoFabricação(int h){
this.AnoFabricação = h;
}
public int calculaGarantia() {
if (Tipo == "PICKUP"){
return AnoFabricação+5;
}
if (Tipo == "SUV"){
return AnoFabricação+3;
}

else {return AnoFabricação+2;}

}

}

import junit.framework.TestCase;
public class VeículoTeste extends TestCase{
public void testVeículo() {
Veículo tt = new Veículo("Placa","PICKUP",1,2000);
assertTrue(tt.calculaGarantia()==2005);
Veículo tt2 = new Veículo("Placa","SUV",1,2000);
assertTrue(tt2.calculaGarantia()==2003);
Veículo tt3 = new Veículo("Placa","POPULAR",1,2000);
assertTrue(tt3.calculaGarantia()==2002);
}
}

public class Serviço {
public String motivo;
public int ID;
public Mecânico Mecanico;
public Veículo Veiculo;
public Serviço(int ID,String motivo, Mecânico Mecanico, Veículo
Veiculo){
this.ID = ID;
this.motivo = motivo;
this.Mecanico = Mecanico;

this.Veiculo = Veiculo;
}
public int getID(){
return this.ID;
}
public String getmotivo(){
return this.motivo;
}
public Mecânico getMecânico(){
return this.Mecanico;
}
public Veículo getVeículo(){
return this.Veiculo;
}
public void setVeículo(Veículo x){
this.Veiculo = x;
}
public void setMecânico(Mecânico x){
this.Mecanico = x;
}
public void setmotivo(String y){
this.motivo = y;
}
public void setID(int h){
this.ID = h;
}
public void ordemServico(String motivo) {
this.setmotivo(motivo);
int oc = this.Veiculo.getNumOcorrencias();
this.Veiculo.setNumOcorrencias(oc+1);
}
}

import junit.framework.TestCase;
public class ServiçoTeste extends TestCase{
public void testServiço() {
Veículo tt = new Veículo("AAAA","SUV",0, 2000);
Mecânico tt2 = new Mecânico(1111,"Juan");
Serviço tt3 = new Serviço(0,"", tt2, tt);
tt3.ordemServico("Pneu Furado");
assertTrue(tt.getNumOcorrencias()==1);
assertTrue(tt3.getmotivo()=="Pneu Furado");
}
}
