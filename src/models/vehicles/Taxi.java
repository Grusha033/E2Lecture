package models.vehicles;

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
        System.out.printf("UUID %s, route %s, capacity %s, is available %s%n",
                uuid, routeNumber, capacity, isAvailable ? "yes" : "no");
    }

    @Override
    public void Move()
    {
        System.out.println("Taxi moved");
    }

    @Override
    public void boardPassenger()
    {

    }

    @Override
    public void disembarkPassenger()
    {

    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void setAvailable(boolean available)
    {
        isAvailable = available;
    }
}
