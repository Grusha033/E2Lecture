package models.vehicles;

public class Tram extends Transport
{
    private final int trackLength;

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
}
