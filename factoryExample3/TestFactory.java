package factoryExample3;

import factoryExample3.utils.TicketCategoryEnum;

public class TestFactory {

	public static void main(String[] args) {
		
		ITicket ticket1 = FactoryTicket.getTicket(TicketCategoryEnum.CONCERTS, "22.06.2019", 100);
		ITicket ticket2 = FactoryTicket.getTicket(TicketCategoryEnum.MUSEUMS, "12.07.2019", 200);
		ITicket ticket3 = FactoryTicket.getTicket(TicketCategoryEnum.EVENTS, "09.09.2019", 300);
		
		ticket1.displayInfo();
		ticket2.displayInfo();
		ticket3.displayInfo();

	}

}
