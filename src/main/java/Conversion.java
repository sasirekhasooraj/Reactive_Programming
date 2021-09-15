import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.text.ParseException;

public class Conversion {

    public static void main(String[] args) throws InterruptedException, ParseException {

        Flowable.range(1, 1000000)
              //  .toFlowable(BackpressureStrategy.BUFFER)
                .toObservable()
                .observeOn(Schedulers.io())
                .subscribe(e -> System.out.println(e+ " " +Thread.currentThread().getName() ));

        Thread.sleep(5000);

    }

}
