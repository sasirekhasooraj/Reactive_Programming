import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class HotOberva_connect {
// Cold - hot
    public static void main(String[] args) throws InterruptedException {

        ConnectableObservable<Long> sourcepublish = Observable.interval(1, TimeUnit.SECONDS).publish();

        sourcepublish.connect();

        sourcepublish.subscribe(System.out::println);

        Thread.sleep(10000);

        sourcepublish.subscribe(System.out::println);
        Thread.sleep(10000);

    }
}
