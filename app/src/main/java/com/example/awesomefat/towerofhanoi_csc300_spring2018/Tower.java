package com.example.awesomefat.towerofhanoi_csc300_spring2018;

/**
 * Created by awesomefat on 2/15/18.
 */

public class Tower
{
    private Disk top;

    public Tower()
    {
        this.top = null;
    }

    public void push(Disk d)
    {
        //equivalent to add front for linked lists
        if(this.top == null)
        {
            this.top = d;
        }
        else
        {
            d.setNextDisk(this.top);
            this.top = d;
        }
    }

    public Disk peek()
    {
        return this.top;
    }

    public Disk pop()
    {
        Disk disk2Remove = this.top;

        if(disk2Remove != null)
        {
            this.top = disk2Remove.getNextDisk();
            disk2Remove.setNextDisk(null);
        }
        return disk2Remove;
    }
}
