import java.awt.EventQueue;


public class Principal {
	
	
	
	public static void main(String[] args) {
		
		Equipo m= new Equipo();
		Equipo n= new Equipo();
		
		VentanaEquipo1 frame = new VentanaEquipo1(m);
		frame.setVisible(true);
		VentanaEquipo1 frame2 = new VentanaEquipo1(n);
		frame.setVisible(true);
			
	}
}
