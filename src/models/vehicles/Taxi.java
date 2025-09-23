package models.vehicles;

import models.user.Passenger;

public class Taxi extends Transport
{
    private boolean isAvailable;

    public Taxi(int routeNumber, int capacity, boolean isAvailable)
    {
        super(routeNumber, capacity);
        this.isAvailable = isAvailable;
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("UUID %s, route %s, capacity %s/%s, is available [%s]%n",
                uuid, routeNumber, currentCapacity, capacity, isAvailable ? "yes" : "no");
    }

    @Override
    public void boardPassenger(Passenger passenger)
    {
        if (isAvailable && currentCapacity < capacity)
        {
            currentCapacity++;

            isAvailable = false;
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

        if (currentCapacity == min) isAvailable = true;
    }

    @Override
    public void Move()
    {
        System.out.println("Taxi moved");
    }
}
