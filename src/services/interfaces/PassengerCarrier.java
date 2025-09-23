package services.interfaces;

import models.user.Passenger;

public interface PassengerCarrier
{
    void boardPassenger(Passenger passenger);
    void disembarkPassenger(Passenger passenger);
}
