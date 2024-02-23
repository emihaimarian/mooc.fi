
public class MainProgram {

    public static void main(String[] args) {

        Counter counter = new Counter(1);
        System.out.println(counter.value());
        
        counter.decrease();
        System.out.println(counter.value());
        
        counter.increase();
        System.out.println(counter.value());
        
        counter.decrease(1);
        System.out.println(counter.value());
        
        
    }
}
