/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Ashly
 */
public class Problema2 implements FavoriteList{

   LinkedPositionalList<String> lista = new LinkedPositionalList();
   Position<String> p;
   int cont = 0;
    @Override
    //Método para acceder a un elemento
    public void access(Object e) {
        if (cont == 0) {
            p = lista.addFirst(e.toString());
            cont++;
        }else{
            p = lista.addAfter(p, e.toString());
        }
    }
//Método para remover un elemento
    @Override
    public void remove(Object e) {
        Node tmp = new Node(e,null,null);
        
        lista.remove(lista.position(tmp));
    }
   
    
    @Override
    public Iterable getFavorites(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    
    }
    
}
