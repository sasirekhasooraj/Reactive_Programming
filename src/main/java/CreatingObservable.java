import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class CreatingObservable {

    public static void main(String[] args) {
        Observable<Integer> src = Observable.create(
          e -> {
              e.onNext(10);
              e.onNext(11);
              e.onComplete();
          }
        );

        src.subscribe(System.out::println);

        // just

        Observable<Integer> just = Observable.just(1,2,3);

        just.subscribe(System.out::println);

    List<String> list = List.of("hi", "hello", "hai");
    Observable<String> sourse = Observable.fromIterable(list);

    sourse.subscribe(System.out::println);

    }
    }
