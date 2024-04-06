
class mycls {
    
    int n=39;
    
    void get(){
        n=10;
    }
}
class child extends mycls{
    int b=20;
}

public class lab2C {
    
public static void main(String[] args) {
    mycls cls = new mycls();
    child cs=new child();
    System.out.println(cs.n);

    
}

}

