/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author l03m04
 */
public class Controlador implements ActionListener{
    
   private Vista view;
   private Modelo model;
    
   public Controlador(Vista view, Modelo model)
   {
       this.view = view;
       this.model = model;
       this.view.btnMultiplicar.addActionListener (this);
   }
   public void iniciar()
   {
       view.setTitle("MVC Multiplicar");
       view.setLocationRelativeTo(null);
   }
   
   public void actionPerformed(ActionEvent e)
   {
       model.setNumeroUno(Integer.parseInt(view.txtnumeroUno.getText()));
       model.setNumeroDos(Integer.parseInt(view.txtnumeroDos.getText()));
       model.multiplicar();
       view.txtResultado.setText(String.valueOf(model.getResultado()));
   }
}
