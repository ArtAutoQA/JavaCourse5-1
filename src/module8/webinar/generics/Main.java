package module8.webinar.generics;

public class Main {
    public static void main(String[] args) {
        DBService<Integer, User, Integer> dbService = new DBService<>();

        User user = new User();
        user.setName("Test");
        dbService.save(user);


        DBService<String, User, Integer> service = new DBService<>();
        //service.save("tttt");



        //generic class example
        //MyClass myClass = new MyClass(); - bad practice
        MyClass<Foo, Boo> myClass = new MyClass<>();

        //foo example
        Foo foo = new Foo();
        Foo foo2 = myClass.doSomething(foo);
        if(foo2 != null) System.out.println("success");

        System.out.println(foo.equals(foo2));


        //boo example
        Boo boo = new Boo();

        myClass.test(boo);


        //---------------------------------------------

        /*MyClassWithObject myClassWithObject = new MyClassWithObject();
        Boo fooObj = new Boo();
        Foo fooObj2 = (Foo) myClassWithObject.doSomething(fooObj);*/
    }
}
