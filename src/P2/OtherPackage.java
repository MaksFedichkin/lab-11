package P2;

class OtherPackage {
    OtherPackage() {
        P1.Protection p = new P1.Protection();
        System.out.println("Кoнcтpyктop из другого пакета");
    // доступно только для данного класса или пакета
    // System.out . println ( "n = " + p.n) ;
    // доступно только для данного класса
    // Sys tem. out . println ( "n_pri = " + p.n_pri ) ;
    // доступно только для данного класса, подкласса или пакета
    // System.out . println ( "n_pro = "+ p.n_pro ) ;
        System.out.println("n_pub = " + p.n_pub);
    }
}
