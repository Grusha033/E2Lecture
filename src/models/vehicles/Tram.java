package models.vehicles;

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
        System.out.printf("UUID %s, route %s, capacity %s, trackLength %sm%n",
                uuid, routeNumber, capacity, trackLength);
    }

    @Override
    public void Move()
    {
        System.out.println("Tram moved");
    }

    @Override
    public void boardPassenger()
    {

    }

    @Override
    public void disembarkPassenger()
    {

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
