/**
 * Created by Garma on 05/07/2015.
 */
public interface GetGenericSum<T extends Number, V extends T> {
    V getSum(T param1, V param2);
}
