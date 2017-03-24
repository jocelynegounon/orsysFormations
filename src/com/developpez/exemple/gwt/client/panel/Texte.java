package com.developpez.exemple.gwt.client.panel;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Texte extends Composite {

	private Label label = new Label();
	private TextBox textBox = new TextBox();
	
	public Texte() {
		HorizontalPanel panel =new HorizontalPanel();
		panel.add(label);
		panel.add(textBox);
		
		textBox.addKeyboardListener(new KeyboardListener() {
			public void onKeyDown(Widget sender, char keyCode, int modifiers) {}
			public void onKeyPress(Widget sender, char keyCode, int modifiers) {}
			public void onKeyUp(Widget sender, char keyCode, int modifiers) {ContactsPanel.instance.filtre();}
		      });
		initWidget(panel);
	}
	
	public void setLabel(String texte){
		label.setText(texte+"  : ");
	}

	public void setTexte(String texte){
		textBox.setText(texte);
	}
	
	public String getTexte(){
		return textBox.getText();
	}
	
}
