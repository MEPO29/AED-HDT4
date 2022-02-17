

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos {

	/**
	 * Lee el archivo e incluye las operaciones en un array
	 * @param path ubicacion del archivo
	 * @return Arreglo que contiene todas las operaciones
	 * @throws IOException si hay error en lectura del archivo
	 */
	public static ArrayList<String> leer(String path) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
        String row;
        while ((row = reader.readLine()) != null){
        	data.add(row);
        }
        reader.close();
        return data;
	}
}