
public class Caminhada {
	   public void andar(Pessoa p) {
	        // verificando o sexo do cachorro
	        // para alterar a mensagem... :-)
	        String artigo = (p.cachorro.sexo == 'F') ? "a" : "o";

	        String msg  = "Eu \"" + p.nome + "\"";
	               msg += " estou andando com " + artigo + " \"";
	               msg += p.cachorro.nome + "\".";
	        System.out.println(msg);
	   
	
		
	}

}
