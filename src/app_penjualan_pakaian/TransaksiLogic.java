/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_penjualan_pakaian;

public class TransaksiLogic {
    private double jumlah,harga_satuan;
    
    public TransaksiLogic(){
        jumlah =0 ;
        harga_satuan = 0;
    }
    public void setJumlah(double a){
        jumlah = a;
    }
    public void setHargaSatuan(double b){
        harga_satuan = b;
    }
    public double getJumlah(){
        return(jumlah);
    }
    public double getHargaSatuan(){
        return(harga_satuan);
    }
    public double getHargaTotal(){
        return(getJumlah()*getHargaSatuan());
    }
}
