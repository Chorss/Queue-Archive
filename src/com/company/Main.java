package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.Add(5);
        q.Add(34);
        q.RemoveStart();

        q.ShowQueue();
        q.ShowHistory();
    }
}