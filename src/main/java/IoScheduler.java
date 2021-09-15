import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class IoScheduler {
    public static void main(String[] args) throws InterruptedException {

        Observable<String> src = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .subscribeOn(Schedulers.single());

        src.subscribe(e -> ioOeration());

        Thread.sleep(6000);

        src.subscribe(e -> ioOeration());
        src.subscribe(e -> ioOeration());
        src.subscribe(e -> ioOeration());
        src.subscribe(e -> ioOeration());
        src.subscribe(e -> ioOeration());



        Thread.sleep(500000);
    }


    public static void ioOeration() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Computation Done By : "+ Thread.currentThread().getName());
    }
}
