import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Copia {
	public static void main(String args[]) {
		FileInputStream  desdeF = null;
		FileOutputStream hastaF = null;
		try {
			desdeF = new FileInputStream("sombrero.jpeg");
			hastaF = new FileOutputStream("sombrero2.jpeg");
		// Copia de los bytes
			int i = desdeF.read(); //lee un unico caracter
			while (i != -1) {
		// -1 si se alcanza el fin de fichero
				hastaF.write(i);
				i = desdeF.read();
			}
			desdeF.close();
			hastaF.close();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Uso: Copia <origen> <destino>");
		}
		catch (FileNotFoundException e) {
			System.err.println("No existe " + e);
		}
		catch (IOException e) {
			System.err.println("Error de E/S " + e);
		}
	}
}
