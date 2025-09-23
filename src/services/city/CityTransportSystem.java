package services.city;

import models.user.Driver;
import models.user.Passenger;
import models.vehicles.Transport;
import services.interfaces.TransportSystem;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CityTransportSystem implements TransportSystem
{
    private final List<Transport> transports = new ArrayList<>();
    private final List<Driver> drivers = new ArrayList<>();
    private final List<Passenger> passengers = new ArrayList<>();

    @Override
    public void addTransport(Transport transport)
    {
        if (!transports.contains(transport))
        {
            transports.add(transport);
        }
    }

    @Override
    public void removeTransport(Transport transport)
    {
        transports.remove(transport);
    }

    @Override
    public void addDriver(Driver driver)
    {
        if (!drivers.contains(driver))
        {
            drivers.add(driver);
        }
    }

    @Override
    public void removeDriver(Driver driver)
    {
        drivers.remove(driver);
    }

    @Override
    public void addPassenger(Passenger passenger)
    {
        if (!passengers.contains(passenger))
        {
            passengers.add(passenger);
        }
    }

    @Override
    public void removePassenger(Passenger passenger)
    {
        passengers.remove(passenger);
    }

    @Override
    public void boardPassengerToTransport(Passenger passenger, Transport transport)
    {
        if (!passenger.haveTicketNumber()) return;

        addPassenger(passenger);
        transport.boardPassenger(passenger);
    }

    @Override
    public void disembarkPassengerFromTransport(Passenger passenger, Transport transport)
    {
        removePassenger(passenger);
        transport.disembarkPassenger(passenger);

        passenger.destroyTicketNumber();
    }

    @Override
    public void displayInfo()
    {
        System.out.println("TRANSPORT");
        transports.forEach(Transport::displayInfo);
        System.out.println("\n\nDRIVERS\n");
        drivers.forEach(Driver::displayInfo);
        System.out.println("\n\nPASSENGERS\n");
        passengers.forEach(Passenger::displayInfo);
    }
}
