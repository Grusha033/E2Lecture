package models.vehicles;

public class Bus extends Transport
{
    private final boolean isDoubleDecker;

    public Bus(int routeNumber, int capacity, boolean isDoubleDecker)
    {
        super(routeNumber, capacity);

        this.isDoubleDecker = isDoubleDecker;
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("UUID %s, route %s, capacity %s, is double decker %s%n",
                uuid, routeNumber, capacity, isDoubleDecker);
    }

    @Override
    public void Move()
    {
        System.out.println("Bus moved");
    }

    @Override
    public void boardPassenger()
    {

    }

    @Override
    public void disembarkPassenger()
    {

    }
}
