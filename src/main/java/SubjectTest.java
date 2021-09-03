import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class SubjectTest {
public static void main(String [] args)
{
    PublishSubject<Object> Subject = PublishSubject.create();

    io.reactivex.rxjava3.subjects.Subject<Object> toSerialized = Subject.toSerialized();
    toSerialized.subscribe(e-> System.out.println(e));

    toSerialized.onNext(10);
    toSerialized.onNext(20);
   // Subject.onComplete();
    toSerialized.onNext(30);


}

}

