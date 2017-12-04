/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**Implementación de la interfaz y sus métodos
 *
 * @author Ashly
 */
public class Problema1 implements DoubleStack{
    
    DoubleLinkedList<String> stack = new DoubleLinkedList<>();
    

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int redSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override 
    public void redPush(Object e) {
        stack.addFirst(e.toString());
    }

    @Override
    public Object redTop() {
        return stack.first();
    }

    @Override
    public Object redPop() {
        return stack.removeFirst();
    }

    @Override
    public int blueSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bluePush(Object e) {
        stack.addLast(e.toString());
    }

    @Override
    public Object blueTop() {
        return stack.last();
    }

    @Override
    public Object bluePop() {
        return stack.removeLast();
    }
    
}
