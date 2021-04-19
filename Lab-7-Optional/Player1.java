import java.nio.channels.AsynchronousFileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Player1 extends Thread {
    private int sum =0;
    private int counter = 1;
    private int numberPlayers;
    private int ok = 0;
    private int ok2 = 0;
    private int value = 0;
    private int maxi = 0;
    private int[][][] playerToken;
    private int[] local;
    private List<Token> tokens = new ArrayList<>();
    private int[] sumPlayers;
    private Lock lock = new ReentrantLock();
    private Object lock2 = new Object();


    public Player1(int numberPlayers, List<Token> tokens){
        setName("Player1");
        this.numberPlayers = numberPlayers;
        this.tokens = tokens;
        this.local = new int[this.numberPlayers];
        this.sumPlayers = new int[this.numberPlayers];
    }

    @Override
    public void run(){
        try {
            run2();
        }catch (InterruptedException e){
            //Stop
        }

    }

    public void run2() throws InterruptedException{
        try {
            synchronized (lock2) {
                lock.lock();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Player" + this.counter  +": " );
                //int tokenName = scanner.nextInt();
                if(scanner.hasNext()) {
                    String input = scanner.next();

                    int tokenName = Integer.parseInt(input);

                    if (ok == 0) {
                        setPlayerAndLocal();
                    }

                    setSum(tokenName);

                    removeToken(tokenName);

                    printTokens();

                    this.ok = this.ok + 1;

                    this.counter = this.counter + 1;
                    if (counter == numberPlayers + 1) {
                        this.counter = 1;
                    }

                    if (this.ok == this.tokens.size()) {
                        printPlayerOptions();
                        printLargestSeq();
                    }
                    //printLocal();
                }
                wait();
            }
        }finally {
            lock.unlock();
        }
    }

    public void check() throws InterruptedException{
        synchronized (lock2) {
            this.ok2 = this.ok2 + 1;
            notify();
        }
    }

    public void setSum(int tokenName){
            this.playerToken[this.counter - 1][this.local[this.counter - 1]][0] = this.tokens.get(tokenName).getValue();
            this.playerToken[this.counter - 1][this.local[this.counter - 1]][1] = this.tokens.get(tokenName).getFirstElement();
            this.playerToken[this.counter - 1][this.local[this.counter - 1]][2] = this.tokens.get(tokenName).getSecondElement();
            this.local[counter - 1] = this.local[counter - 1] + 1;
            if(this.maxi < this.tokens.get(tokenName).getFirstElement()){
                this.maxi = this.tokens.get(tokenName).getFirstElement();
            }
            if(this.maxi < this.tokens.get(tokenName).getSecondElement()){
                this.maxi = this.tokens.get(tokenName).getSecondElement();
            }
    }

    public void printLargestSeq(){
        int maxi = 0;
        for(int i=0; i < this.numberPlayers; i++) {
            int sumPlayer=0;
            if(this.local[i]>1) {
                for (int j = 0; j < this.local[i] - 1; j++) {
                    int first = this.playerToken[i][j][2];
                    int value = this.playerToken[i][j][0];
                    int sumlocal = 0;
                    int ok = 0;
                    for (int k = j + 1; k < this.local[i]; k++) {
                        if (first == this.playerToken[i][k][1]) {
                            sumlocal = sumlocal + this.playerToken[i][k][0] + value;
                            first = this.playerToken[i][k][2];
                            value = this.playerToken[i][k][0];
                            ok++;

                        }
                    }
                    if (ok == 0) {
                        for (int k = 0; k < this.local[i]; k++) {
                            if (sumPlayer < this.playerToken[i][k][0]) {
                                sumPlayer = this.playerToken[i][k][0];
                            }
                        }
                    } else {
                        if (sumPlayer < sumlocal) {
                            sumPlayer = sumlocal;
                        }
                    }
                    this.sumPlayers[i] = sumPlayer;
                    if(maxi < this.sumPlayers[i]){
                        maxi = this.sumPlayers[i];
                    }
                }
            }
            else{
                this.sumPlayers[i] = this.playerToken[i][0][0];
                if(maxi < this.sumPlayers[i]){
                    maxi = this.sumPlayers[i];
                }
            }
        }
        for(int i=0; i<this.numberPlayers; i++){
            int counter = i+1;
            System.out.println("Suma Player"+ counter +": " + this.sumPlayers[i]);
        }
        for(int i=0; i<this.numberPlayers; i++){
            int counter = i+1;
            if(maxi == this.sumPlayers[i]){
                System.out.println("Winner is: Player"+ counter);
            }
        }
    }
    public List<Token> getTokenList(){
        return this.tokens;
    }



   public void removeToken(int tokenName){
       for(int i=0; i<this.tokens.size(); i++) {
           if(i == tokenName){
               this.tokens.get(i).setValue(-1);
               break;
           }
       }
   }

   public void printTokens(){
       for(int i=0; i<this.tokens.size(); i++){
           if(this.tokens.get(i).getValue() != -1) {
               System.out.println("t" + i + " = " + this.tokens.get(i).getValue() + " - Value");
               System.out.println("t" + i + "(" + this.tokens.get(i).getFirstElement() + "," + this.tokens.get(i).getSecondElement() + ")");
               System.out.println();
           }
       }
   }

   public void setPlayerAndLocal(){
        this.playerToken = new int[this.tokens.size()+1][this.tokens.size()/numberPlayers + 2][3];
        for(int i=0 ; i < this.numberPlayers; i++){
            this.local[i] = 0;
            this.sumPlayers[i] = 0;
        }
    }

    public void printPlayerOptions(){
        int counter = 1;
        for(int i=0; i < this.numberPlayers; i++){
            for(int j=0; j < this.local[i]; j++){
                for(int k=0; k < 3; k++){
                    if(k==0) {
                        System.out.println("Player" + counter + ": " + "value =" + this.playerToken[i][j][k]);
                    }
                    if(k==1){
                        System.out.println("Player" + counter + ": " + "first element ="+ this.playerToken[i][j][k]);
                    }
                    if(k==2){
                        System.out.println("Player" + counter + ": " + "second element ="+ this.playerToken[i][j][k]);
                    }

                }
            }
            counter = counter+1;
        }
    }

    /*public void insertIndex(){
        for(int i=0; i<this.tokens.size(); i++) {
            this.index.add(i);
            this.index.set(i,i);
            if(i==0){
                this.index.set(i,1);
            }
        }
    }

    public void printLocal(){
        for(int i=0; i<this.local.size(); i++){
            System.out.println("t" + i + " = " +this.local.get(i).getValue() + " - Value");
            System.out.println("t" + i + "(" + this.local.get(i).getFirstElement() + "," + this.local.get(i).getSecondElement() + ")");
            System.out.println();
        }
    }*/

    /*public void printTokens(){
        this.counteR = 0;
        for(int i=0; i<this.tokens.size(); i++){
            if(this.index.get(i)!=0 && i!=0) {
                System.out.println("t" + this.counteR + " = " + this.tokens.get(i).getValue() + " - Value");
                System.out.println("t" + this.counteR + "(" + this.tokens.get(i).getFirstElement() + "," + this.tokens.get(i).getSecondElement() + ")");
                System.out.println();
                this.counteR = this.counteR + 1;

            }
            if(this.index.get(i)==0 && i!=0) {
                this.counteR = this.counteR + 1;
                System.out.println("t" + this.counteR + " = " + this.tokens.get(i).getValue() + " - Value");
                System.out.println("t" + this.counteR + "(" + this.tokens.get(i).getFirstElement() + "," + this.tokens.get(i).getSecondElement() + ")");
                System.out.println();
                this.counteR = this.counteR + 1;
            }
            if(i==0){
                if(this.index.get(i)==0) {
                    this.counteR = this.counteR + 1;
                }
                else{
                    System.out.println("t" + this.counteR + " = " + this.tokens.get(i).getValue() + " - Value");
                    System.out.println("t" + this.counteR + "(" + this.tokens.get(i).getFirstElement() + "," + this.tokens.get(i).getSecondElement() + ")");
                    System.out.println();
                    this.counteR = this.counteR + 1;
                }
            }
        }
    }*/


   /* public void removeTokenName(int tokenName){

        int i = this.tokens.size() -1;
        while (i > tokenName){
            local.add(this.tokens.get(i));
            this.tokens.remove(i);
            i--;
        }
        this.tokens.remove(i);
        Collections.reverse(this.local);
        this.tokens.addAll(this.local);
        for(int j=0; j<this.local.size(); j++){
            this.local.remove(j);
        }
    }*/
}
