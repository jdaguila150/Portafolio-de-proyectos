import java.util.*;

class TGS{
	
	public static void main (String [] main){
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.println("\n$$ -> ID de TGS:");
			String usuario = teclado.nextLine();
			
			if(usuario.equals("jgnyi")){
				EnvioTGS enviotgs = new EnvioTGS();
				enviotgs.MensajeCliente();
			} else{
				System.out.println("\n$$ -> ID incorrecto");
			}
		}
	}
	
}	