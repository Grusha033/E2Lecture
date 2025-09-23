package models.user;

import models.vehicles.Transport;

public class Driver extends Person
{
    public Driver(String name)
    {
        super(name);
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("Driver: UUID %s, Name %s%n", uuid, name);
    }

    public void drive(Transport transport)
    {
        System.out.println("Driver UUID: " + uuid + " " + transport.getClass().getSimpleName());
        transport.Move();
    }
}
