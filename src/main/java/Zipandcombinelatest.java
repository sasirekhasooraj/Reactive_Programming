import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Zipandcombinelatest {
    public static void main(String[] args) throws InterruptedException {
     //   Observable<Long> src1 = Observable.interval(200, TimeUnit.MILLISECONDS);
        Observable<Long> src1 = Observable.interval(200, TimeUnit.MILLISECONDS).take(10);
     //   Observable<Long> src2 = Observable.interval(1, TimeUnit.SECONDS);
        Observable<Long> src2 = Observable.interval(1, TimeUnit.SECONDS).take(10);
      //  Observable.zip(src1, src2, (e1, e2) -> "Source 1 : "+e1+" Source 2: " + e2)
       Observable.combineLatest(src1, src2, (e1, e2) -> "Source 1 : "+e1+" Source 2: " + e2)
                .subscribe(System.out::println);

        Thread.sleep(20000);


    }
}
