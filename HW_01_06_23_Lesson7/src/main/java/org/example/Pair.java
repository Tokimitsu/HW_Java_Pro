package org.example;

public class Pair <String, Integer>
{
    public String name;
    public Integer id;

    public Pair(String first, Integer second)
    {
        this.name = first;
        this.id = second;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

}
