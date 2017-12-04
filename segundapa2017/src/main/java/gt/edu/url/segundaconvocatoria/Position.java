/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**interfaz de la posición
 *
 * @author Ashly
 */
public interface Position<E> {
	
	E getElement() throws IllegalStateException;

}