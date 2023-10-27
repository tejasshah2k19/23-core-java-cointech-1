public class MultiLevelInhDemo {
    public static void main(String args[]){
        SantaBanta sb = new SantaBanta();
        sb.printSanta();
        sb.printBanta();
        sb.printSantaBanta();
    }
}

class Santa {
    void printSanta(){
        System.out.println("Santa");
    }
}
class Banta extends Santa{

    void printBanta(){
        System.out.println("Banta");
    }
}
class SantaBanta extends Banta{

    void printSantaBanta(){
        System.out.println("SantaBanta");
    }
}