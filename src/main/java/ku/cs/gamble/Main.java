package ku.cs.gamble;
//Podjanin Wachirawittayakul 6510450691
public class Main {
    public static void main(String[] args) {
        int n = 5;
        GumballMachine gumballMachine = new GumballMachine(n);
        for (int i = 0; i < n; i++){
            gumballMachine.insert();
            if (i == 3)
                gumballMachine.insert();
            gumballMachine.takeTurn();
        }
    }
}
