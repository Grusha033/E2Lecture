package services.interfaces;

import models.user.Passenger;

public interface TicketOffice
{
    void makeTicket(int times);

    void giveTicket(Passenger passenger);
}
