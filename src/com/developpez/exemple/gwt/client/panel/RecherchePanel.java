package com.developpez.exemple.gwt.client.panel;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class RecherchePanel extends HorizontalPanel {

	public static RecherchePanel instance;
	
	private Texte tb = new Texte();
	private Texte tb2 = new Texte();
	
	public RecherchePanel(){
		this.setTitle("Recherche");
		this.setWidth("100%");
		
		tb.setLabel("Nom");
		add(tb);
				
		tb2.setLabel("Prénom");
		add(tb2);
					
		this.setStyleName("contact-RecherchePanel");
	instance=this;
	}
	
	public String getNom(){
		return tb.getTexte();
	}
	
	public String getPrenom(){
		return tb2.getTexte();
	}
}
