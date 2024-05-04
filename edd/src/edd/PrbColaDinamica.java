/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd;

/**
 *
 * @author Estrada
 */
public class PrbColaDinamica
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ColasD obj = new ColasD();

        Nodo obj2 = new Nodo("Carros", "Mazda");
        Nodo obj3 = new Nodo("Telefonos", "Samnsung");
        Nodo obj4 = new Nodo("Plumas", "Bic");
        Nodo obj5 = new Nodo("Teclado", "Razer");

        obj.inserta(obj2);
        obj.inserta(obj3);
        obj.inserta(obj4);
        obj.inserta(obj5);

        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina().getObj());
        System.out.println(obj.elimina());
        System.out.println(obj.elimina());
    }

}
