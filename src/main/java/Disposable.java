import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Disposable {
    public static void main(String [] args) throws InterruptedException {
        Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);

        io.reactivex.rxjava3.disposables.Disposable d = interval.subscribe(e -> System.out.println("Observer 1:" + e));
         Thread.sleep(5000);
         d.dispose();
        interval.subscribe(e-> System.out.println("Observer 2:" + e));
        Thread.sleep(1000);
    }

}
