package module4.webinar.interfaces;

import module4.webinar.abstractclassesandmethods.DeveloperEmployee;

public interface DBService {
    //void test();
    //void method(int a, int b, String name);
    //
    //

    abstract void save(DeveloperEmployee employee);

    abstract DeveloperEmployee get(long id);

    abstract void update(DeveloperEmployee employee);

    abstract DeveloperEmployee[] getAllDevelopers();
}
