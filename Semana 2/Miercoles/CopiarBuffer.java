import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class CopiarBuffer{

    public void copia(){
        try{
            File f = new File("pruebalectura.txt");
            FileReader fr = new FileReader(f); //caracter por caracter
            BufferedReader br = new BufferedReader(fr); //linea por linea
            String linea;

            File archivo = new File("archivocopia.txt");
            FileWriter fw = new FileWriter(archivo, true);
            BufferedWriter bw = new BufferedWriter(fw);

            while((linea=br.readLine()) != null){
                 bw.write(linea+"\n");
            }

            br.close();
            fr.close();
            bw.close();
            fw.close();
        }
        catch(IOException e){}
    }
}
