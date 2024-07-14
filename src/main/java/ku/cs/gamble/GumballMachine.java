package ku.cs.gamble;
//Podjanin Wachirawittayakul 6510450691
public class GumballMachine {
    private int gumBall;
    private boolean noQuarter;
    private boolean hasQuarter;
    private boolean outOfGumball;

    public GumballMachine(int gumBall) {
        this.gumBall = gumBall;
        this.noQuarter = true;
        this.hasQuarter = false;
        this.outOfGumball = false;
        System.out.println("Mighty Gumball, Inc.\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory : " + this.gumBall + " gumballs.\n" +
                "Machine is waiting for quarter.");
    }

    public void setNoQuarter() {
        noQuarter = true;
        hasQuarter = false;
    }

    public void setHasQuarter() {
        hasQuarter = true;
        noQuarter = false;
    }

    public void setOutOfGumball() {
        this.outOfGumball = true;
    }

    public void insert()
    {
        if(outOfGumball)
        {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (hasQuarter) {
            System.out.println("You can't insert another quarter");
        }
        else {
            System.out.println("You inserted the quarter");
            setHasQuarter();
        }
    }

    public void takeTurn()
    {
        if(hasQuarter) {
            System.out.println("You turned...\n" +
                    "A gumball comes rolling out the slot");
            setNoQuarter();
        } else if (gumBall > 0) {
            gumBallSold();
        }else {
            setOutOfGumball();
            System.out.println("You turned, but there is no gumballs");
            if(hasQuarter)
                setNoQuarter();
        }
    }

    public void gumBallSold()
    {
        gumBall--;
        System.out.println("\n");
        System.out.println("Inventory: " + this.gumBall + " gumballs.");
    }
}
