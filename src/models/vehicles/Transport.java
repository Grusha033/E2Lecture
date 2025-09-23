package models.vehicles;

import models.user.Passenger;
import services.interfaces.PassengerCarrier;

import java.util.UUID;

public abstract class Transport implements PassengerCarrier
{
    protected final UUID uuid;
    protected final int capacity;

    protected int currentCapacity;
    protected int routeNumber;

    public Transport(int routeNumber, int capacity)
    {
        this.uuid = UUID.randomUUID();
        this.routeNumber = routeNumber;
        this.capacity = capacity;

        this.currentCapacity = 0;
    }

    public void boardPassenger(Passenger passenger)
    {
        if (currentCapacity < capacity)
        {
            currentCapacity++;
        }
    }

    @Override
    public void disembarkPassenger(Passenger passenger)
    {
        byte min = 0;
        if (currentCapacity > min)
        {
            currentCapacity--;
        }
    }

    public abstract void displayInfo();

    public void Move()
    {
        System.out.println("Transport moved");
    }

    public UUID getUuid()
    {
        return uuid;
    }

    public int getRouteNumber()
    {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber)
    {
        this.routeNumber = routeNumber;
    }

    public int getCapacity()
    {
        return capacity;
    }
}
