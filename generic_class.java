public class generic_class <T> {
    T obj;

    public generic_class(T objIn){
this.obj = objIn;
    }

void showType(){
    System.out.println(obj.getClass().getName());
}

}
