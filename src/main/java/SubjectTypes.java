import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.*;

import java.util.concurrent.TimeUnit;

public class SubjectTypes {
    public static void main(String[] args) throws InterruptedException {

        @NonNull UnicastSubject<Object> subject = UnicastSubject.create();

       Observable.interval(500, TimeUnit.MILLISECONDS)
                .subscribe(subject);

        Thread.sleep(2000);

    //    @NonNull UnicastSubject<Object> subject = UnicastSubject.create();
        subject.subscribe(e -> System.out.println("Subscriber 1: "+ e));

        Thread.sleep(2000);

	//    subject.onNext("a");
	//	subject.onNext("b");
	//	subject.onNext("c");

      // subject.subscribe(e -> System.out.println("Subscriber 2: "+ e));

	//	subject.onNext("d");
	//	subject.onNext("e");
	//	subject.onComplete();


    }
}
