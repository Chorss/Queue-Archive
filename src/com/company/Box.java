package com.company;

public class Box
{
    private int value;
    private Box next;
    public int GetValue()
    {
        return this.value;
    }
    public void SetValue(int value)
    {
        this.value = value;
    }
    public Box GetBox()
    {
        return this.next;
    }
    public void SetBox(Box value)
    {
        this.next = value;
    }
    public Box(int val, Box box)
    {
        this.value = val;
        this.next = box;
    }
}