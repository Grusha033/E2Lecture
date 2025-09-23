package services.interfaces;

import models.user.Driver;
import models.user.Passenger;
import models.vehicles.Transport;

public interface TransportSystem
{
    void addTransport(Transport transport);
    void removeTransport(Transport transport);

    void addDriver(Driver driver);
    void removeDriver(Driver driver);

    void addPassenger(Passenger passenger);
    void removePassenger(Passenger passenger);

    void boardPassengerToTransport(Passenger passenger, Transport transport);
    void disembarkPassengerFromTransport(Passenger passenger, Transport transport);

    void displayInfo();
}
