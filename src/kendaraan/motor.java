/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;
/**
 *
 * @author wulan
 */
public class motor  extends kendaraan {
public motor(int posisi) {
super(posisi);
}
@Override
public void Move() {
setPosisi(getPosisi() + 30);
}
}
