/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku1;

/**
 *
 * @author CHELO
 */
public class Sudoku1 {

     public static void main(String[] args) {
//         int[][]tablero={
//             {5,3,0,0,7,0,0,0,0},
//             {6,0,0,1,9,5,0,0,0},
//             {0,9,8,0,0,0,0,6,0},
//             {8,0,0,0,6,0,0,0,3},
//             {4,0,0,8,0,3,0,0,1},
//             {7,0,0,0,2,0,0,0,6},
//             {0,6,0,0,0,0,2,8,0},
//             {0,0,0,4,1,9,0,0,5},
//             {0,0,0,0,8,0,0,7,9}
//         };
         
         int[][] tablero2 = { {0,4,2,3},
                            {0,0,1,0},
                            {0,4,3,0},
                            {0,0,2,4}};
         
         Juego juego = new Juego(tablero2);
         juego.resolverSudoku();
         juego.imprimir();
     }
    
}
