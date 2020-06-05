package classes;
import classes.Plantae;

public class Briofitas extends Plantae{
    
	private boolean rizoides;
 private boolean cauloide;
 private boolean filoides;
    
	public Briofitas(String no, int ta, String cl, String es){
 super(no,ta,cl,es);
 this.rizoides= true;
 this.cauloide= true;
 this.filoides= true;
	} 
 
 public boolean getRizoides() {
		return this.rizoides;
	}
 
 public boolean getCauloide() {
		return this.cauloide;
	}
    
 public boolean getFiloides() {
		return this.filoides;
	}
 
 public void soltarEsporos() {
		System.out.println("\n"+this.getNome()+" está soltando esporos!");
	}
	
		@Override
	public String toString() {
		return "=======================================================================\n" +
		"\n"+this.getNome() +" é da divisão das Briófitas!\n" +
				"\nPlantinha Info\n" + "Nome: " + nome + "\nTamanho: " + tamanho + "cm"
		 +"\nClasse: " + classe + "\nEspecie: " + especie + "\n"+ "\nInformações específicas das Briófitas:"
		 +"\nPossui rizoides? "+ this.getRizoides()+"\nPossui cauloide? "
		 +this.getCauloide()+"\nPossui filoides? "+this.getFiloides()+
				"\n=======================================================================\n";
	}
}
