/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHELO
 */
public class JuegoTest {

    

    
    private Juego juego;
    
    public JuegoTest() {
    }
    
    @Before
    public void setUp() {
    }

    
    
    @Test
    public void testTabla1x1() {
        int[][]tabla1x1 = {{0}};
        juego = new Juego(tabla1x1);
        assertTrue(juego.resolverSudoku());
    }
    
    
    
    @Test
    public void testTabla2x2(){
        int[][]tablero = { {0,2,4,3},
                            {0,0,1,0},
                            {0,4,3,0},
                            {0,0,2,4}};
        
        juego = new Juego(tablero);
        assertTrue(juego.resolverSudoku());
    }
    
    @Test
    public void testTabla3x3(){
        int[][]tablero={
             {5,3,0,0,7,0,0,0,0},
             {6,0,0,1,9,5,0,0,0},
             {0,9,8,0,0,0,0,6,0},
             {8,0,0,0,6,0,0,0,3},
             {4,0,0,8,0,3,0,0,1},
             {7,0,0,0,2,0,0,0,6},
             {0,6,0,0,0,0,2,8,0},
             {0,0,0,4,1,9,0,0,5},
             {0,0,0,0,8,0,0,7,9}
         };
        juego = new Juego(tablero);
        assertTrue(juego.resolverSudoku());
    }
    
    
    
    
}
