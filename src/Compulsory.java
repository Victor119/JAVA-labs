public class Compulsory {
    public static void main(String args[]) {
        //challenge 1
        System.out.println("Hellow World!");
        //challenge 2
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        //challenge 3
        int n = (int) (Math.random() * 1_000_000);
        //challenge 4
        //parseInt -transform first argument in string , parse the string then returns int
        n = n * 3; //multiplica n cu 3
        n = n + Integer.parseInt("10101", 2); // aduna 10101 in baza 2 la n
        n = n + Integer.parseInt("FF", 16); // aduna FF in baza 16 la n
        n = n * 6; // multiplica n cu 6
        System.out.println("numarul este = " + n);
        //challenge 5
        //Calculate the digit sum until the digit sum < 10
        int sumTotal = 0, copyN = n;
        while (copyN > 9){
            int sumLocal = 0;
            while (copyN > 0) {
                sumTotal = sumTotal + copyN % 10; // total sum
                sumLocal = sumLocal + copyN % 10; // digit sum of the current number
                copyN = copyN / 10;
            }
            copyN = sumLocal;
        }
        System.out.println(sumTotal);
        //challenge 6
        System.out.println("Willy-nilly, this semester I will learn " + languages[copyN]);
    }
}