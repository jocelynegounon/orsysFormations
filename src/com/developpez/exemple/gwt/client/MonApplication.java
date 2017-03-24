package com.developpez.exemple.gwt.client;

import com.developpez.exemple.gwt.client.panel.ContactsPanel;
import com.developpez.exemple.gwt.client.panel.RecherchePanel;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.WindowResizeListener;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MonApplication implements EntryPoint , WindowResizeListener {

	private DockPanel  outer = new DockPanel();
	
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    
	HorizontalPanel recherchePanel =new RecherchePanel();  
	VerticalPanel contactsPanel =new ContactsPanel();  
	  
	outer.setWidth("100%");
	outer.setHeight("100%");
	// Hook the window resize event, so that we can adjust the UI.
    Window.addWindowResizeListener(this);

    // Get rid of scrollbars, and clear out the window's built-in margin,
    // because we want to take advantage of the entire client area.
    Window.enableScrolling(false);
    Window.setMargin("10px");

    outer.add(recherchePanel, DockPanel.NORTH);
    outer.add(contactsPanel, DockPanel.CENTER);
    outer.setCellHeight(recherchePanel, "1");
    
    RootPanel.get().add(outer);
  }
  
  public void onWindowResized(int width, int height) {
		// TODO Auto-generated method stub
	}
}
