package br.com.controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arTTh
 */
public class Dobro {
            private double valor;
            
            public double getValor(){
                return valor;
            }
            
            public void setValor(double valor){
                this.valor = valor;
            }
            
            public double calcular(){
                return this.valor * 2;
            }
}
