package singleton;

public class Company {

    private static Company instance =new Company();

    public static Company getInstance() {
        return instance;
    }
    private Company(){

    }

    /*
    private static Company instance = new Company(); //내부 및 단 한개
    //private 값이 널이되거나 바꾸는거 방지 static 단 한개

    private Company() {
        System.out.println("d");
    }//외부에서 이 거를 호출하지 못하게 하겠다.

    public static Company getInstance() {
        return instance;// instance 객체를 외부에서 가져다 쓸 수 있다.
    */}
}
