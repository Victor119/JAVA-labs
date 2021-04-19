import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    int secondsPassed =0;
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondsPassed++;
            if(secondsPassed == 10){
                
            }
        }
    };

    public void start(){
        myTimer.scheduleAtFixedRate(task,1000,1000);
    }
    public static void main(String[] args) throws InterruptedException {
        List<Token> tokens = new ArrayList<>();
        Random rand = new Random();
        int numberTokens = rand.nextInt(10); // generam un numar random intre 0-24
        int numberPlayers = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul total de player:");
        String number = scanner.nextLine() ;


        numberPlayers=Integer.parseInt(number);

        for(int i=0; i<numberTokens; i++){
            //Cream un token cu valori aleatoare
            Token tokenInsert = new Token();
            int valueNumber = rand.nextInt(10);
            tokenInsert.setValue(valueNumber);

            int first = rand.nextInt(10);
            tokenInsert.setFirstElement(first);

            int second = rand.nextInt(10);
            tokenInsert.setSecondElement(second);

            //Salvam token-ul in lista
            tokens.add(tokenInsert);
        }

        for(int i=0; i<tokens.size(); i++){
            System.out.println("t" + i + " = " +tokens.get(i).getValue() + " - Value");
            System.out.println("t" + i + "(" + tokens.get(i).getFirstElement() + "," + tokens.get(i).getSecondElement() + ")");
            System.out.println();
        }

        /*Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Player 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Player 2");

        t1.start();
        t2.start();*/

            int ok = tokens.size();
            Player1 player1 = new Player1(numberPlayers,tokens);
            while (ok > 0) {
                Main mainThread = new Main();
                mainThread.startThreadPool(player1);
                ok--;
            }
    }

    private void startThreadPool(Player1 player1){
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.submit(player1);

        executorService.shutdown();
    }


    /*private static void createPlayer1Thread(){
        new Player1().start();
    }

    private static void createPlayer2Thread(){
        new Player2().start();
    }*/
}

/*
class Countdown {

    private int i;

    public void doCountdown() {
        String color = new String();
        Scanner scanner = new Scanner(System.in);

        switch(Thread.currentThread().getName()) {
            case "Player ":
                color = "abc";
                break;
            default:
        }

        for(i=10; i > 0; i--) {
            System.out.print("Player 1: " );
            int tokenName = scanner.nextInt();
        }
        scanner.close();
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
*/
