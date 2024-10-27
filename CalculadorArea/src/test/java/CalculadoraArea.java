import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.BeforeClass;
import org.junit.Test;


public class CalculadoraArea {
	
	private static CalculadoraArea Areas;
	
	@BeforeClass
	public static void setUpClass(){
		
		Areas = new CalculadoraArea();
	
	}

	@Test
    public void AreaCirculo() {
        assertEquals(78.54, CalculadoraMain.AreaCirculo(5), 0.01);
    }
	@Test
    public void AreaCirculo_2() {
        assertEquals(1256.64, CalculadoraMain.AreaCirculo(20), 0.01);
    }
	@Test
    public void AreaCirculo_3() {
        assertEquals(314.16, CalculadoraMain.AreaCirculo(10), 0.01);
    }
	@Test
	public void CirculoAreaSame() {
	     Double area1 = CalculadoraMain.AreaCirculo(0.1);
	     Double area2 = area1; 
	        assertSame(area1, area2);
	    }
	
	
	
	

    @Test
    public void CuadradoArea() {
        assertEquals(25, CalculadoraMain.AreaCuadrado(5), 0.01);
    }
    @Test
    public void CuadradoArea_2() {
        assertEquals(6.25, CalculadoraMain.AreaCuadrado(2.5), 0.01);
    }
    @Test
    public void CuadradoArea_3() {
        assertEquals(100, CalculadoraMain.AreaCuadrado(10), 0.01);
    }
    
    
    

    @Test
    public void RectangluloArea() {
        assertEquals(50, CalculadoraMain.AreaRectangulo(5, 10), 0.01);
    }
    @Test
    public void RectangluloArea_2() {
        assertEquals(12, CalculadoraMain.AreaRectangulo(3, 4), 0.01);
    }
    @Test
    public void RectangluloArea_3() {
        assertEquals(3, CalculadoraMain.AreaRectangulo(1.5, 2), 0.01);
    }
    
    
    
    

    @Test
    public void TrianguloArea() {
        assertEquals(25, CalculadoraMain.AreaTriangulo(10, 5), 0.01);
    }
    @Test
    public void TrianguloArea_2() {
        assertEquals(3.75, CalculadoraMain.AreaTriangulo(2.5, 3), 0.01);
    }
    @Test
    public void TrianguloArea_3() {
        assertEquals(3, CalculadoraMain.AreaTriangulo(3, 2), 0.01);
    }
}
