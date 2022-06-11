package main.java.org.gunendu.generics.pojo;

public class PersonContainer<T> {

    private T obj;

    public PersonContainer() {
    }

    PersonContainer(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
