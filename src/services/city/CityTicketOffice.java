package services.city;

import models.user.Passenger;
import services.interfaces.TicketOffice;

import java.util.*;

public class CityTicketOffice implements TicketOffice
{
    private final Queue<UUID> tickets = new LinkedList<>();
    
    @Override
    public void makeTicket(int times)
    {
        for (int i = 0; i < times; i++)
        {
            tickets.add(UUID.randomUUID());
        }
    }

    @Override
    public void giveTicket(Passenger passenger)
    {
        passenger.setTicketNumber(tickets.poll());
    }
}
