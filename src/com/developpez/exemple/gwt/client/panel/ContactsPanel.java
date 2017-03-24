package com.developpez.exemple.gwt.client.panel;

import com.developpez.exemple.gwt.client.util.Contact;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ContactsPanel extends VerticalPanel {

	private FlexTable t = new FlexTable();
	public static ContactsPanel instance;
	public ContactsPanel() {
	    t.setTitle("Contacts");	
	    t.setText(0, 0,"Nom");
	    t.setText(0, 1,"Prénom");
	    t.setText(0, 2,"Email");
	    t.setText(0, 3,"Tel");
	    t.setWidth("100%");
	    t.setCellSpacing(2);
	   
	    for (int i = 0; i < 4; i++) {
	    	 t.getCellFormatter().addStyleName(0, i, "contact-ContactPanel");
		}
	    
	    for (int i = 0; i < Contact.getAllContacts().length; ++i)
	      addContact(Contact.getAllContacts()[i],i+1);
	    
	    this.add(t);
	    this.setWidth("100%");
	    instance=this;
	 }

	private void addContact(Contact contact,int i) {
	    t.setText(i, 0,contact.getNom());
	    t.setText(i, 1,contact.getPrenom());
	    t.setText(i, 2,contact.getEmail());
	    t.setText(i, 3,contact.getTel());
	    
	    for (int j = 0; j < 4; j++) {
	    	if(i%2==0)
	    		t.getCellFormatter().addStyleName(i, j, "contact-ContactPanel-line1");
	    	else
	    		t.getCellFormatter().addStyleName(i, j, "contact-ContactPanel-line2");	
		}
	}
	
	public void filtre(){
		String nom = RecherchePanel.instance.getNom();
		String prenom = RecherchePanel.instance.getPrenom();
		for (int i = t.getRowCount()-1; i >0 ; i--) {
			t.removeRow(1);
		}
		int next =1;
	    for (int i = 0; i < Contact.getAllContacts().length; ++i){
		 Contact contact =Contact.getAllContacts()[i];
		 		
		 if (contact.getNom().toUpperCase().startsWith(nom.toUpperCase()) && contact.getPrenom().toUpperCase().startsWith(prenom.toUpperCase())) {
			 addContact(contact,next);
			 next++;
		 }
	    }
	}
	
}
