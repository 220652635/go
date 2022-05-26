package SwingApp;

class Computer
{
    //Member function to store IPAddress and value
    String IPAddress;
    float Value;
    //Parametrized constructor
    public Computer(String ip,float value )
    {
        this.IPAddress=ip;
        this.Value=value;
    }
    public String toString()
    {
        return this.IPAddress+" $"+ this.Value+"\n";
    }
}