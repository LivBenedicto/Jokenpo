package app;

// player 1 : user
public class User {
    private int victory;
    private String name;

    public void setName (String userName) { this.name = userName; }
    public String GetName() { return name; }

    // counter user wins
    protected void CounterVictories() { this.victory++; }

    public String Historic() {
        // returns user numbers of victories
        return "Name: " + name + "\n" +
                "Number of Victories: " + victory;
    }
}
