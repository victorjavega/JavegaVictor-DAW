import java.io.Serializable;
public class Equipo implements Serializable {
	
	private String nombreEquipo;
	private int golesFavor;
	private int golesEnContra;
	private int partidosGanados;
	private int partidosPerdidos;

	public Equipo(String nom, int golesF, int golesC, int partidosG, int partidosP) {
		// TODO Auto-generated constructor stub
	
		nombreEquipo=nom;
		golesFavor=golesF;
		golesEnContra=golesC;
		partidosGanados=partidosG;
		partidosPerdidos=partidosP;
	}
public Equipo() {
		// TODO Auto-generated constructor stub
	nombreEquipo="";
	}
public void setNombre(String a)
	{
	nombreEquipo=a;
	}
public String getNombre()
	{
	return nombreEquipo;
	}
public void setGolesFavor(int a)
	{
	golesFavor=a;
	}
public int getGolesFavor()
	{
	return golesFavor;
	}
public void setGolesContra(int b)
	{
	golesEnContra=b;
	}
public int getGolesContra()
	{
	return golesEnContra;
	}
public void setPartidosGanados(int c)
	{
	partidosGanados=c;
	}
public int getPartidosGanados()
	{
	return partidosGanados;
	}
public void setPartidosPerdidos(int d)
	{
	partidosPerdidos=d;
	}
public int getPartidosPerdidos()
	{
	return partidosPerdidos;
	}

}
