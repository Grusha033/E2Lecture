package models.user;

import java.util.UUID;

public class Passenger extends Person
{
    private UUID ticketNumber;

    public Passenger(String name)
    {
        super(name);
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("Passenger: UUID %s, Name %s, ticket number %s%n", uuid, name, ticketNumber);
    }

    public void setTicketNumber(UUID ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    public boolean haveTicketNumber() { return ticketNumber != null; }

    public void destroyTicketNumber() {ticketNumber = null;}
}

