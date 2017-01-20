package module9.questions;

/**
 * Created by citsym on 16.01.17.
 */
@FunctionalInterface
public interface ForJava8<T> {

    String getDescription(T obj);


 default  String getDescription2(T obj){
     return "";
 };
}
