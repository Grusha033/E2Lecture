package models.user;

import java.util.UUID;

public abstract class Person
{
    protected final UUID uuid;
    protected String name;

    public Person(String name)
    {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }

    public abstract void displayInfo();
}
