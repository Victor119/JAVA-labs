public class First {

    public static void main(String[] args) {
        Source S1 = new Source(Source.SourceType.FACTORY, 10);
        Source S2 = new Source(Source.SourceType.WAREHOUSE,35);
        Source S3 = new Source(Source.SourceType.WAREHOUSE,25);
        System.out.println("S1 S2 S3");
        System.out.println(S1.toString() + " " + S2.toString()+ " " + S3.toString());
        Destination D1 = new Destination(Source.SourceType.FACTORY,2);
        Destination D2 = new Destination(Source.SourceType.FACTORY,3);
        Destination D3 = new Destination(Source.SourceType.FACTORY,1);
        System.out.println("D1 D2 D3");
        System.out.println(D1.toString() + " " + D2.toString()+ " " + D3.toString());
        D1 = new Destination(Source.SourceType.WAREHOUSE,5);
        D2 = new Destination(Source.SourceType.WAREHOUSE,4);
        D3 = new Destination(Source.SourceType.WAREHOUSE,8);
        System.out.println(D1.toString() + " " + D2.toString()+ " " + D3.toString());
        D1 = new Destination(Source.SourceType.WAREHOUSE,5);
        D2 = new Destination(Source.SourceType.WAREHOUSE,6);
        D3 = new Destination(Source.SourceType.WAREHOUSE,8);
        System.out.println(D1.toString() + " " + D2.toString()+ " " + D3.toString());
        Problem P1 = new Problem(20);
        Problem P2 = new Problem(25);
        Problem P3 = new Problem(25);
        System.out.println("P1 P2 P3");
        System.out.println(P1.toString() + " " + P2.toString()+ " " + P3.toString());

    }
}
