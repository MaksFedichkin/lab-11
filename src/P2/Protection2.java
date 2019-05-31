package P2;

public class Protection2 extends P1.Protection{
    Protection2(){
        System.out.println("Кoнcтpyктop, унаследованный из другого пакета");
        //доступно только для данного класса или пакета
        //System.out.println( "n = " + n );
        //доступно только для данного класса
        //System.out.println ( "n_pri = " + n_p ri );
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
