package com.company;

public class Queue implements InterfaceQueue
{
    private Box start;
    private Box end;
    private Archive History = new Archive();
    public Box GetStart()
    {
        return this.start;
    }
    public void SetStart(Box value)
    {
        this.start = value;
    }
    public Box GetEnd()
    {
        return this.end;
    }
    public void SetEnd(Box value)
    {
        this.end = value;
    }
    public boolean IsEmpty()
    {
        History.AddHistory(Action.IsEmpty);

        if(GetStart() == null && GetEnd() == null)
            return true;

        return false;
    }
    public void Add(int value)
    {
        if (!IsEmpty())
        {
            GetEnd().SetBox(new Box(value, null));
            SetEnd(GetEnd().GetBox());
        }
        else
        {
            Box box = new Box(value, null);
            SetStart(box);
            SetEnd(box);
        }

        History.AddHistory(Action.Add);
    }
    public void MakeEmpty()
    {
        SetStart(null);
        SetEnd(null);

        History.AddHistory(Action.MakeEmpty);
    }
    public void RemoveStart()
    {
        if (!IsEmpty())
            SetStart(GetStart().GetBox());

        History.AddHistory(Action.RemoveStart);
    }
    public void ShowQueue()
    {
        if(!IsEmpty())
        {
            int i = 0;
            Box next = null;
            do{
                i++;
                if(i==1)
                {
                    System.out.println("i:" + i + " value:" + GetStart().GetValue());
                    next = GetStart().GetBox();
                }
                else
                {
                    System.out.println("i:" + i + " value:" + next.GetValue() );
                    next = next.GetBox();
                }
            }while (next!= null);
        }
        else
            System.out.println("Queue is empty");

        History.AddHistory(Action.Show);
    }
    public void ShowHistory()
    {
        History.ShowHistory();
    }
}