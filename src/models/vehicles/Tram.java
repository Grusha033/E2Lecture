package models.vehicles;

import models.user.Passenger;

public class Tram extends Transport
{
    private int trackLength;

    public Tram(int routeNumber, int capacity, int trackLength)
    {
        super(routeNumber, capacity);
        this.trackLength = trackLength;
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("UUID %s, route %s, capacity %s/%s, trackLength %sm%n",
                uuid, routeNumber, currentCapacity, capacity, trackLength);
    }

    @Override
    public void Move()
    {
        System.out.println("Tram moved");
    }

    public int getTrackLength()
    {
        return trackLength;
    }

    public void setTrackLength(int trackLength)
    {
        this.trackLength = trackLength;
    }
}
