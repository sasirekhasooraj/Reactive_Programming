import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class CreatObservable {

    public static void main(String[] args) {

        Observable<Integer> src = Observable.create(
             e -> {
                 e.onNext(10);
                 e.onNext(11);
                 e.onComplete();
             }


        );

    src.subscribe(System.out::println);

   System.out.println("*************");

    //just
    Observable<Integer> just = Observable.just(10,11,12,13);
    just.subscribe(System.out::println);

        System.out.println("*************");

List<String> list = List.of("hi","hello","hai");
Observable<String>  fromIn= Observable.fromIterable(list);
fromIn.subscribe(System.out::println);
    }


}
