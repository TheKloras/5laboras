package com.company;

import com.company.sarasas.SarasasImpl;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.lang.Thread;

public class Main {

    public static void main(String[] args) {
        SarasasImpl sarasas1 = new SarasasImpl("Jonas", "Vinis", 5000, 4.99);
        SarasasImpl sarasas2 = new SarasasImpl("Edgaras", "Plaktukas", 5000, 4.99);
        SarasasImpl sarasas3 = new SarasasImpl("Romas", "Vinis", 4000, 4.99);
        SarasasImpl sarasas4 = new SarasasImpl("Deimantas", "Vinis", 5000, 4.99);
        SarasasImpl sarasas5 = new SarasasImpl("Jocys", "Vinis", 5000, 4.99);
        SarasasImpl sarasas6 = new SarasasImpl("Mindaugas", "Vinis", 5, 4.99);
        SarasasImpl sarasas7 = new SarasasImpl("Vytautas", "Vinis", 50000, 4.99);
        SarasasImpl sarasas8 = new SarasasImpl("Joris", "Medsraigtis", 50, 4.99);
        SarasasImpl sarasas9 = new SarasasImpl("Ignas", "Vinis", 5000, 4.99);
        SarasasImpl sarasas10 = new SarasasImpl("Kestutis", "Tepalas", 5000, 4.99);

        LinkedList<SarasasImpl> sarasaslist = new LinkedList<>();
        sarasaslist.add(sarasas1);
        sarasaslist.add(sarasas2);
        sarasaslist.add(sarasas3);
        sarasaslist.add(sarasas4);
        sarasaslist.add(sarasas5);
        sarasaslist.add(sarasas6);
        sarasaslist.add(sarasas7);
        sarasaslist.add(sarasas8);
        sarasaslist.add(sarasas9);
        sarasaslist.add(sarasas10);

        Iterator<SarasasImpl> iterator1 = sarasaslist.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        Collections.sort(sarasaslist);
        Iterator<SarasasImpl> iterator2 = sarasaslist.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().getDetalesKaina() > 100) {
                iterator2.remove();
            }
        }
        System.out.println("---------------------------------------------");
        SarasasImpl[] temp = new SarasasImpl[1];
        Iterator<SarasasImpl> iterator3 = sarasaslist.iterator();
        while (iterator3.hasNext()) {
            temp[0] = iterator3.next();
            System.out.print(temp[0].toString());
            if (temp[0].getPagamintasKiekis() >= 1000) {
                System.out.println(" NORMA ĮVYKDYTA");
            } else {
                System.out.println(" NORMA NEĮVYKDYTA");
            }
        }
    }
}
