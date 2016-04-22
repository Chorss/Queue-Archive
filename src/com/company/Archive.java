package com.company;

import java.util.*;

public class Archive
{
    private List<Action> History = new ArrayList<Action>();
    public void ShowHistory()
    {
        if(!History.isEmpty())
            for (Action item:History)
                System.out.println(item.toString());
        else
            System.out.println("Archive is empty");
    }
    public void AddHistory(Action item)
    {
        History.add(item);
    }
}