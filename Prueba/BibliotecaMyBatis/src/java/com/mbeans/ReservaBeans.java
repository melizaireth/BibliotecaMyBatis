/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Melissa
 */
@ManagedBean(name = "reserva")
@RequestScoped
public class ReservaBeans {

    /**
     * Creates a new instance of ReservaBeans
     */
    public ReservaBeans() {
    }
    private int index = 0;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
    
}
