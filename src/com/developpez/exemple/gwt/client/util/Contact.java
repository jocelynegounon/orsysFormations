package com.developpez.exemple.gwt.client.util;

/**
 * @author  BRROULLA
 */
public class Contact {

	public String email;
	public String nom;
	public String prenom;
	public String tel;
    public String photo = "default_photo.jpg";

    public Contact() {
    }
    
    public Contact(String prenom, String nom, String email,String tel) {
    	setNom(nom);
    	setPrenom(prenom);
    	setEmail(email);
    	setTel(tel);
    }

	/**
	 * @return  email
	 * @uml.property  name="email"
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email  email à définir
	 * @uml.property  name="email"
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return  nom
	 * @uml.property  name="nom"
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom  nom à définir
	 * @uml.property  name="nom"
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return  photo
	 * @uml.property  name="photo"
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo  photo à définir
	 * @uml.property  name="photo"
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return  prenom
	 * @uml.property  name="prenom"
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom  prenom à définir
	 * @uml.property  name="prenom"
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return  tel
	 * @uml.property  name="tel"
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel  tel à définir
	 * @uml.property  name="tel"
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
    
	public static Contact[] getAllContacts(){
		Contact[] contacts = new Contact[]{
			    new Contact("Paul","Mc Cartney","@dvp.com","12"),
			    new Contact("Ringo","Starr","@dvp.com","12"),
			    new Contact("Yoko","Uno","@dvp.com","12"),
			    new Contact("Bob","Dilan","@dvp.com","12"),
			    new Contact("Ludwig","Von Beethoven","@dvp.com","12"),
			    new Contact("Georges","Harrison","@dvp.com","12"),
			    new Contact("Dick","Annegarn","@dvp.com","12"),
			    new Contact("John","Lennon","@dvp.com","12")};		
		return contacts;
	}
	
}
