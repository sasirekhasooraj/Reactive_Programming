import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ComputationalSchedulers{
    public static void main(String[] args) throws InterruptedException {

        Observable<String> src = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
              .subscribeOn(Schedulers.computation());
  //.subscribeOn(Schedulers.newThread());


        src.subscribe(e -> compute());
         Thread.sleep(6000);
        src.subscribe(e -> compute());
        src.subscribe(e -> compute());
        src.subscribe(e -> compute());
        src.subscribe(e -> compute());



        Thread.sleep(50000);

    }


    public static void compute() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Computation Done By : "+ Thread.currentThread().getName());
    }
}
