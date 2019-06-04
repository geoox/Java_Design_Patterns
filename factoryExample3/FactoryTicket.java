package factoryExample3;

import factoryExample3.utils.TicketCategoryEnum;

public class FactoryTicket {
	public static OnlineTicket getTicket(TicketCategoryEnum category, String date, int price) {
		OnlineTicket ticket = null;
		switch(category) {
		case MUSEUMS:{
			ticket = new MuseumTicket(date, price);
			break;
		}
		case EVENTS:{
			ticket = new EventTicket(date, price);
			break;
		}
		case CONCERTS:{
			ticket = new ConcertTicket(date, price);
			break;
		}
		}
		return ticket;
	}
}
