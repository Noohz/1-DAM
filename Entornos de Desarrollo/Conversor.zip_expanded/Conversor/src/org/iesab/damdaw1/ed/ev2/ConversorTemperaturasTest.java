package org.iesab.damdaw1.ed.ev2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class ConversorTemperaturasTest {

	@Test
	public void testLeerTemperatura1() throws IOException {
		// Preparación
		ConversorTemperaturas ct = new ConversorTemperaturas();
		String frase = "";
        BufferedReader br = new BufferedReader(new StringReader(frase));
        
		// Invocación
        List<TemperaturaVo> tLT = ct.leerTemperaturas(br);
        
		// Comprobación
        assertTrue(tLT.isEmpty());
	}

	@Test
	public void testLeerTemperatura2() throws IOException {
		// Preparación
		ConversorTemperaturas ct = new ConversorTemperaturas();
        BufferedReader br = new BufferedReader(new StringReader("199.0 Kelvin Celsius"));
        
		// Invocación
        List<TemperaturaVo> tLT = ct.leerTemperaturas(br);
        
		// Comprobación
        /* He estado intentando que se ejecutase de forma correcta usando asserTrue como en los test que hicimos en clase pero da error a la hora de comprobar los test así que buscando he encontrado que la solución sería cambiar asserTrue por assertEquals. 
        
        assertTrue(tLT.size() == 1);
        assertTrue(tLT.get(0).getValor() == 199.0f);
        assertTrue(tLT.get(0).getEscalaOrigen().equals("Kelvin"));
        assertTrue(tLT.get(0).getEscalaDestino().equals("Celsius"));*/
        
        assertEquals(1, tLT.size());
        assertEquals(199.0f, tLT.get(0).getValor(), 0.01);
        assertEquals(Escala.KELVIN, tLT.get(0).getEscalaOrigen());
        assertEquals(Escala.CELSIUS, tLT.get(0).getEscalaDestino());
	}
	
	@Test
	public void testLeerTemperatura3() throws IOException {
		// Preparación
		ConversorTemperaturas ct = new ConversorTemperaturas();
        BufferedReader br = new BufferedReader(new StringReader("112.0 Celsius Kelvin\n4.0 Kelvin Celsius\n74.0 Fahrenheit Celsius\n"));
        
		// Invocación
        List<TemperaturaVo> tLT = ct.leerTemperaturas(br);
        
		// Comprobación
        assertEquals(3, tLT.size());
        assertEquals(112.0f, tLT.get(0).getValor(), 0.01);
        assertEquals(Escala.CELSIUS, tLT.get(0).getEscalaOrigen());
        assertEquals(Escala.KELVIN, tLT.get(0).getEscalaDestino());
        
        assertEquals(4.0f, tLT.get(1).getValor(), 0.01);
        assertEquals(Escala.KELVIN, tLT.get(1).getEscalaOrigen());
        assertEquals(Escala.CELSIUS, tLT.get(1).getEscalaDestino());
        
        assertEquals(74.0f, tLT.get(2).getValor(), 0.01);
        assertEquals(Escala.FAHRENHEIT, tLT.get(2).getEscalaOrigen());
        assertEquals(Escala.CELSIUS, tLT.get(2).getEscalaDestino());
	}
	
	@Test
	public void testGuardarTemperaturas1() {
	    // Preparación
	    List<TemperaturaVo> tLT = Arrays.asList(
	        new TemperaturaVo(52.2f, "Celsius", "Kelvin"),
	        new TemperaturaVo(931.2f, "Fahrenheit", "Celsius")
	    );
	    
	    StringWriter sW = new StringWriter();
	    PrintWriter pw = new PrintWriter(sW);
	    
	    // Invocación
	    new ConversorTemperaturas().guardarTemperaturas(tLT, pw);
	    
	    // Comprobación
	    String resultado = sW.toString().trim();
	    assertTrue(resultado.contains("52.2 Celsius Kelvin"));
	    assertTrue(resultado.contains("931.2 Fahrenheit Celsius"));
	}

	@Test
	public void testGuardarTemperaturas2() {
	    // Preparación
	    List<TemperaturaVo> tLT = Collections.emptyList();
	    
	    StringWriter sW = new StringWriter();
	    PrintWriter pw = new PrintWriter(sW);
	    
	    // Invocación
	    new ConversorTemperaturas().guardarTemperaturas(tLT, pw);
	    
	    // Comprobación
	    String resultado = sW.toString().trim();
	    assertTrue(resultado.isEmpty());
	}

	@Test
	public void testGuardarTemperaturas3() {
	    // Preparación
	    List<TemperaturaVo> tLT = new ArrayList<>();
	    
	    StringWriter sW = new StringWriter();
	    PrintWriter pw = new PrintWriter(sW);

	    // Invocación
	    new ConversorTemperaturas().guardarTemperaturas(tLT, pw);

	    // Comprobación
	    String resultado = sW.toString().trim();
	    assertTrue(resultado.isEmpty());
	}
	
	@Test
	public void testConvertirTemperatura1() {
	    // Preparación
	    float tempOrigen = 65.0f; // Temperatura Celsius
	    float resultadoCalculo = 338.0f; // Temperatura Kelvin

	    // Invocación
	    float total = new ConversorTemperaturas().convertirTemperaturta(tempOrigen, Escala.CELSIUS, Escala.KELVIN);

	    // Comprobación
	    assertTrue(Math.abs(resultadoCalculo - total) < 0.01f);
	}

	@Test
	public void testConvertirTemperatura2() {
	    // Preparación
	    float tempOrigen = 364.0f; // Temperatura Kelvin
	    float resultadoCalculo = 195.53f; // Temperatura Fahrenheit

	    // Invocación
	    float total = new ConversorTemperaturas().convertirTemperaturta(tempOrigen, Escala.KELVIN, Escala.FAHRENHEIT);

	    // Comprobación
	    assertTrue(Math.abs(resultadoCalculo - total) < 0.01f);
	}

	@Test
	public void testConvertirTemperatura3() {
	    // Preparación
	    float tempOrigen = 140.0f; // Temperatura Fahrenheit
	    float resultadoCalculo = 333.0f; // Temperatura Kelvin

	    // Invocación
	    float total = new ConversorTemperaturas().convertirTemperaturta(tempOrigen, Escala.FAHRENHEIT, Escala.KELVIN);

	    // Comprobación
	    assertTrue(Math.abs(resultadoCalculo - total) < 0.01f);
	}	
}
