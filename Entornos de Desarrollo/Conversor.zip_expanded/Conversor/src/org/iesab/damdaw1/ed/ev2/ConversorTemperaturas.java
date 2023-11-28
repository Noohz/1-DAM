package org.iesab.damdaw1.ed.ev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ConversorTemperaturas{
    public final static String NOMBRE_FICHERO_TEMPERATURAS_ENTRADA = "ftemps.txt";
    public final static String NOMBRE_FICHERO_TEMPERATURAS_SALIDA = "ftempsconv.txt";
    public final static String CARACTER_SEPARADOR = " ";
    
    
	public List<TemperaturaVo> leerTemperaturas(BufferedReader br) throws IOException {
		List<TemperaturaVo> lTemperaturas = new ArrayList<TemperaturaVo>();
		String temperaturaActual = "";
		String[] vTemperatura = new String[3]; // valor escalaOrigen escalaDestino
		while (((temperaturaActual = br.readLine()) != null) && (!temperaturaActual.equals(""))) {
			vTemperatura = temperaturaActual.split(CARACTER_SEPARADOR); // valor escalaOrigen escalaDestino
			TemperaturaVo tempVoActual = new TemperaturaVo(Float.parseFloat(vTemperatura[0]), vTemperatura[1],
					vTemperatura[2]);
			lTemperaturas.add(tempVoActual);
		}

		return lTemperaturas;
	}
    
    public void guardarTemperaturas(List<TemperaturaVo> lTemperaturas, PrintWriter pw) {    	
    	for (TemperaturaVo tempActual : lTemperaturas) {
    		pw.println(tempActual);
		}
    }
    
    public float convertirTemperaturta(float tempOrigen, Escala escalaOrigen, Escala escalaDestino ) {
    	float tempConvertida=0.0f;
    	if (escalaOrigen.getNombre().equalsIgnoreCase(Escala.CELSIUS.getNombre())) {
    		if (escalaDestino.getNombre().equalsIgnoreCase(Escala.KELVIN.getNombre())) {
    			tempConvertida=tempOrigen+273;
    		} else if (escalaDestino.getNombre().equalsIgnoreCase(Escala.FAHRENHEIT.getNombre())) {
    			tempConvertida=(tempOrigen*9/5)+32;
    		}
    	} else if (escalaOrigen.getNombre().equalsIgnoreCase(Escala.KELVIN.getNombre())) {
    		if (escalaDestino.getNombre().equalsIgnoreCase(Escala.CELSIUS.getNombre())) {
    			tempConvertida=tempOrigen-273;
    		} else if (escalaDestino.getNombre().equalsIgnoreCase(Escala.FAHRENHEIT.getNombre())) {
    			tempConvertida=((tempOrigen-273)*9/5)+32;
    		}
    	} else if (escalaOrigen.getNombre().equalsIgnoreCase(Escala.FAHRENHEIT.getNombre())) {
    		if (escalaDestino.getNombre().equalsIgnoreCase(Escala.CELSIUS.getNombre())) {
    			tempConvertida=(tempOrigen-32)*5/9;
    		} else if (escalaDestino.getNombre().equalsIgnoreCase(Escala.KELVIN.getNombre())) {
    			tempConvertida=((tempOrigen-32)*5/9)+273;
    		}
    	}
    	
    	return tempConvertida;
    }
    
    public static void main(String[] args) {
    	try {
        	FileReader fr = new FileReader(NOMBRE_FICHERO_TEMPERATURAS_ENTRADA);
        	BufferedReader br = new BufferedReader(fr);
        	FileWriter fw = new FileWriter(NOMBRE_FICHERO_TEMPERATURAS_SALIDA);
        	PrintWriter pw = new PrintWriter(fw);
        	ConversorTemperaturas convTemp=new ConversorTemperaturas();
        	List<TemperaturaVo> lt = convTemp.leerTemperaturas(br);
        	for (TemperaturaVo tActual : lt) {
        		tActual.setValorConvertido(convTemp.convertirTemperaturta(tActual.getValor(), tActual.getEscalaOrigen(), tActual.getEscalaDestino()));
        	}        
        	convTemp.guardarTemperaturas(lt, pw);
        	br.close();
        	pw.close();
    	} catch(IOException e) {
    		e.printStackTrace();
    	}
    }
}