package mb;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.sp.pictureservice.facade.IEventFacade;
import org.sp.pictureservice.facade.impl.EventFacadeImpl;
import org.sp.pictureservice.model.Event;

@ManagedBean(name="eventMB")
@RequestScoped
public class EventMB {
	
	@EJB
	private IEventFacade eventFacade = new EventFacadeImpl();
	
	private Event event;
	
	public void addEvent(String name, String grusswort, boolean fuerGastFreigegeben,
			Date archivierungsDatum, Date erstellungsDatum) {
		eventFacade.saveEvent(new Event(name, grusswort, fuerGastFreigegeben, archivierungsDatum, erstellungsDatum));
	}
}
