package encapsulamento;

public class Class2 extends ClassGeral1{


      public Class2(String tecido, String marca, String cor) {
		super(tecido, marca, cor);
		
	}

	//Cal�a
   private String bainha;
   private String bolso;
   private boolean ziper;
       
     
       public Class2(String tecido,String bainha,String bolso,boolean ziper, String marca, String cor) {
	   super(tecido, marca, cor);
	
	this.bainha=bainha;
	this.bolso=bolso;
	this.ziper=ziper;
}

public String getBainha() {
	return bainha;
}

public void setBainha(String bainha) {
	this.bainha = bainha;
}

public String getBolso() {
	return bolso;
}

public void setBolso(String bolso) {
	this.bolso = bolso;
}

public boolean isZiper() {
	return ziper;
}

public void setZiper(boolean ziper) {
	this.ziper = ziper;
}

}
