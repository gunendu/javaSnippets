package main.java.org.gunendu.generics.pojo;

public class BoundedPersonContainer<T extends Person> {

    T obj;

    public BoundedPersonContainer() {
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public <S extends Student> String concatStr(S student1, S student2) {
        return student1.getUniversity() + " " + student2.getUniversity();
    }
}
