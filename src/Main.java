import models.user.Driver;
import models.user.Passenger;
import models.vehicles.Bus;
import models.vehicles.Taxi;
import models.vehicles.Tram;
import models.vehicles.Transport;
import services.city.CityTicketOffice;
import services.city.CityTransportSystem;
import services.interfaces.TransportSystem;

public class Main
{
    public static void main(String[] args)
    {
        Transport bus = new Bus(3, 50, true);
        Transport tram = new Tram(1, 100, 150);
        Transport taxi = new Taxi(12, 4, true);

        Driver busDriver = new Driver("Bob");
        Driver tramDriver = new Driver("Freak");
        Driver taxiDriver = new Driver("Joe");

        Passenger busPassenger = new Passenger("Mike");
        Passenger busPassengerTwo = new Passenger("Wazowski");
        Passenger tramPassenger = new Passenger("Max");
        Passenger tramPassengerTwo = new Passenger("Gitl");
        Passenger taxiPassenger = new Passenger("Crazy DAVE");

        TransportSystem transportSystem = new CityTransportSystem();
        CityTicketOffice cityTicketOffice = new CityTicketOffice();

        cityTicketOffice.makeTicket(5);
        cityTicketOffice.giveTicket(busPassenger);
        cityTicketOffice.giveTicket(busPassengerTwo);
        cityTicketOffice.giveTicket(tramPassenger);
        cityTicketOffice.giveTicket(tramPassengerTwo);
        cityTicketOffice.giveTicket(taxiPassenger);

        transportSystem.addTransport(bus);
        transportSystem.addTransport(tram);
        transportSystem.addTransport(taxi);

        transportSystem.addDriver(busDriver);
        transportSystem.addDriver(tramDriver);
        transportSystem.addDriver(taxiDriver);

        transportSystem.boardPassengerToTransport(busPassenger, bus);
        transportSystem.boardPassengerToTransport(busPassengerTwo, bus);
        transportSystem.boardPassengerToTransport(tramPassenger, tram);
        transportSystem.boardPassengerToTransport(tramPassengerTwo, tram);
        transportSystem.boardPassengerToTransport(taxiPassenger, taxi);

        busDriver.drive(bus);
        tramDriver.drive(tram);
        taxiDriver.drive(taxi);

        transportSystem.displayInfo();

        transportSystem.disembarkPassengerFromTransport(busPassenger, bus);
        transportSystem.disembarkPassengerFromTransport(busPassengerTwo, bus);

        transportSystem.displayInfo();

        transportSystem.removeTransport(bus);
        transportSystem.removeDriver(busDriver);
    }
}
