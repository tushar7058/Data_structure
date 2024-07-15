// package Java OOPs;

class pen{
   
    String color ;
    String type ;


    public void colors_type(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

    void pens(){
        System.out.println("no of pens ");
    }
    void writing(){
        System.out.println("it is used for writing");
    }
}
public class classes {
    public static void main(String[] args) {
        
        pen p = new pen(); // creating instance of class to acces its methodology
        p.color = "blue ";
        p.type = "Ballpoint pen";

        p.colors_type();
    }
}


