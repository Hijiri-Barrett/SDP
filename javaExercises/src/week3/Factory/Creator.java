package week3.Factory;

/**
 * Created by hbarre03 on 19/01/2016.
 */
public interface Creator{

    default Product factory() {return null;}
}
