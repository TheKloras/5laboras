package com.company.sarasas;

import java.util.Comparator;

public class SarasasImpl implements Sarasas,Comparable{
    private String darbininkas;
    private String detale;
    private int pagamintasKiekis;
    private double detalesKaina;

    public SarasasImpl(String darbininkas, String detale, int pagamintasKiekis, double detalesKaina){
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.pagamintasKiekis = pagamintasKiekis;
        this.detalesKaina = detalesKaina;
    }
    @Override
    public String getDarbininkas() {
        return this.darbininkas;
    }

    @Override
    public void setDarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;
    }

    @Override
    public String getDetale() {
        return this.detale;
    }

    @Override
    public void setDetale(String detale) {
        this.detale = detale;
    }

    @Override
    public int getPagamintasKiekis() {
        return this.pagamintasKiekis;
    }

    @Override
    public void setPagamintasKiekis(int pagamintasKiekis) {
        this.pagamintasKiekis = pagamintasKiekis;
    }

    @Override
    public double getDetalesKaina() {
        return this.detalesKaina;
    }

    @Override
    public void setDetalesKaina(double detalesKaina) {
        this.detalesKaina = detalesKaina;
    }

    @Override
    public String toString() {
        return "SarasasImpl{" +
                "darbininkas='" + darbininkas + '\'' +
                ", detale='" + detale + '\'' +
                ", pagamintasKiekis=" + pagamintasKiekis +
                ", detalesKaina=" + detalesKaina +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Comparator
                .comparing(SarasasImpl::getPagamintasKiekis).reversed()
                .thenComparing(SarasasImpl::getDetale)
                .compare(this,(SarasasImpl)o);
    }
}
